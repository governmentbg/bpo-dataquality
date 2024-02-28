package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CPdfBookmark;
import bg.duosoft.patentsexporter.service.PdfBookmarkService;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PdfBookmarkServiceImpl implements PdfBookmarkService {
    public List<CPdfBookmark> getPdfBookmarks(byte[] content) {
        try {
            List<CPdfBookmark> res = new ArrayList<>();
            try (PDDocument document = Loader.loadPDF(content)) {
                readBookmarks(document, document.getDocumentCatalog().getDocumentOutline(), res);
            }
            return res;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readBookmarks(PDDocument document, PDOutlineNode bookmark, List<CPdfBookmark> result) throws IOException {
        PDOutlineItem current = bookmark == null ? null : bookmark.getFirstChild();
        while (current != null) {
            PDPage currentPage = current.findDestinationPage(document);
            Integer currentPageIndex = document.getPages().indexOf(currentPage);
            result.add(new CPdfBookmark(current.getTitle(), currentPageIndex + 1));
            readBookmarks(document, current, result);
            current = current.getNextSibling();
        }
    }
}
