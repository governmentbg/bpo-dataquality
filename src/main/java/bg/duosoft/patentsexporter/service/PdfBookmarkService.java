package bg.duosoft.patentsexporter.service;


import bg.duosoft.patentsexporter.domain.core.CPdfBookmark;

import java.util.List;


public interface PdfBookmarkService {
    List<CPdfBookmark> getPdfBookmarks(byte[] content);
}
