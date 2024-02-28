package bg.duosoft.patentsexporter.generator;

import bg.duosoft.patentsexporter.converter.BgPatentDocumentConverter;
import bg.duosoft.patentsexporter.domain.core.CPatentAttachment;
import bg.duosoft.patentsexporter.domain.core.CPatentsPublication;
import bg.duosoft.patentsexporter.domain.core.CPdfBookmark;
import bg.duosoft.patentsexporter.domain.jaxb.generated.BgPatentDocument;
import bg.duosoft.patentsexporter.domain.jaxb.generated.BgPatentDocuments;
import bg.duosoft.patentsexporter.domain.jaxb.generated.BibliographicData;
import bg.duosoft.patentsexporter.service.PatentsPublicationService;
import bg.duosoft.patentsexporter.service.PdfBookmarkService;
import bg.duosoft.patentsexporter.util.PropertyAccess;
import bg.duosoft.patentsexporter.util.UtilsPatent;
import bg.duosoft.patentsexporter.zip.FileName;
import bg.duosoft.patentsexporter.zip.FilePath;
import bg.duosoft.patentsexporter.zip.ZipMultipleDirectories;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class PublicationFileGenerator {

    private static final String XSD_PORTAL_URL = "https://portal.bpo.bg/documents/10180/150535/bg-patent-document-v2-3BG.XSD";
    private static final String PATENTS_FOLDER_NAME = "Patents";
    private static final String PUB_CODE_A = "A";
    private static final String PUB_CODE_B1 = "B1";
    private static final String PUB_CODE_U1 = "U1";
    private static String numberXmlFolder = null;
    private static String numberPdfFolder = null;


    private final BgPatentDocumentConverter bgPatentDocumentConverter;
    private final PatentsPublicationService patentsPublicationService;
    private final PdfBookmarkService pdfBookmarkService;
    private final FileName fileName;
    private final PropertyAccess propertyAccess;

    public String generatePublicationFile(String number, Integer year) throws Exception {
        List<String> errors = new ArrayList<>();
        String stringYear = String.valueOf(year);
        String journalNameByDate;
        LocalDate dttopubli = patentsPublicationService.getFirstDtToPubli(number, year);
        if (dttopubli == null) {
            journalNameByDate = "Patents " + number + "-" + stringYear;
        } else {
            journalNameByDate = UtilsPatent.getDateAsString(dttopubli);
        }

        JAXBContext jaxbContext = JAXBContext.newInstance(BibliographicData.class);
        String mainDirectory = propertyAccess.getFilesPath();
        numberXmlFolder = FilePath.path(mainDirectory, PATENTS_FOLDER_NAME, stringYear, number, journalNameByDate, "Biblio");
        numberPdfFolder = FilePath.path(mainDirectory, PATENTS_FOLDER_NAME, stringYear, number, journalNameByDate, "Images");
        String zipOutputDirectory = mainDirectory + "/" + PATENTS_FOLDER_NAME + "/" + stringYear + "/" + number;

        log.info("Patents directory was created !");

        List<CPatentsPublication> allPublicationNosect1 = patentsPublicationService
                .getPublicationsByNosectNumberYear(number, year, 1);
        if (allPublicationNosect1 != null && allPublicationNosect1.size() != 0) {
            exportToXml(allPublicationNosect1, PUB_CODE_A, jaxbContext, errors);
            exportToPdf(allPublicationNosect1, PUB_CODE_A, errors);
            log.info("Publications with publication code A were exported ! !");
        }
        List<CPatentsPublication> allPublicationNosect2 = patentsPublicationService
                .getPublicationsByNosectNumberYear(number, year, 2);
        if (allPublicationNosect2 != null && allPublicationNosect2.size() != 0) {
            exportToXml(allPublicationNosect2, PUB_CODE_B1, jaxbContext, errors);
            exportToPdf(allPublicationNosect2, PUB_CODE_B1, errors);
            log.info("Publications with publication code B1 were exported ! !");
        }
        List<CPatentsPublication> allPublicationNosect5 = patentsPublicationService
                .getPublicationsByNosectNumberYear(number, year, 5);
        if (allPublicationNosect5 != null && allPublicationNosect5.size() != 0) {
            exportToXml(allPublicationNosect5, PUB_CODE_U1, jaxbContext, errors);
            exportToPdf(allPublicationNosect5, PUB_CODE_U1, errors);
            log.info("Publications with publication code U1 were exported ! !");
        }

        if (CollectionUtils.isEmpty(errors)) {
            //clear old zip or error log
            File folder = new File(zipOutputDirectory);
            File[] fList = folder.listFiles();
            ArrayList<File> filesToArchive = new ArrayList<>();
            if (Objects.nonNull(fList) && fList.length > 0) {
                for (File f : fList) {
                    if (f.getName().endsWith(".zip") || f.getName().endsWith(".txt")) {
                        f.delete();
                    } else {
                        filesToArchive.add(f);
                    }
                }
            }
            ZipMultipleDirectories.zipFiles(filesToArchive, journalNameByDate, zipOutputDirectory);
            log.info("Publications were zipped successfully! Folder: " + zipOutputDirectory);
            return zipOutputDirectory + "/" + journalNameByDate + ".zip";
        } else {
            String errorTxtPath = zipOutputDirectory + "/" + journalNameByDate + "-errors.txt";
            FileWriter writer = new FileWriter(errorTxtPath);
            for (String str : errors) {
                writer.write(str + System.lineSeparator());
            }
            writer.close();
            log.info("There was inconsistent information! Generated list of errors to fix! Folder: " + zipOutputDirectory);
            return errorTxtPath;
        }
    }

    private void exportToXml(List<CPatentsPublication> publicationList, String publicationCode, JAXBContext jaxbContext, List<String> errors) throws Exception {

        for (CPatentsPublication publication : publicationList) {

            String errBase = "Biblio/" + publicationCode + "/" + fileName.fullFileName(publication);
            if (!StringUtils.hasText(publication.getPtappli().getTitle())) {
                errors.add(errBase + ": Missing title in Bulgarian");
            }
            if (!StringUtils.hasText(publication.getPtappli().getEngTitle())) {
                errors.add(errBase + ": Missing title in English");
            }
            if (Objects.nonNull(publication.getPtappli().getPtAbstract())) {
                if (!StringUtils.hasText(publication.getPtappli().getPtAbstract().getTxtform())) {
                    errors.add(errBase + ": Missing abstract in Bulgarian");
                }
                if (!StringUtils.hasText(publication.getPtappli().getPtAbstract().getTxtformtr())) {
                    errors.add(errBase + ": Missing abstract in English");
                }
            } else {
                errors.add(errBase + ": Missing abstract data");
            }

            try {
                BgPatentDocument convertEN = bgPatentDocumentConverter
                        .bgPatentConvert(publication, true);
                BgPatentDocument convertBG = bgPatentDocumentConverter
                        .bgPatentConvert(publication, false);
                BgPatentDocuments bgPatentDocuments = new BgPatentDocuments();
                bgPatentDocuments.getBgPatentDocument().add(convertBG);
                bgPatentDocuments.getBgPatentDocument().add(convertEN);
                Marshaller marshaller = jaxbContext.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, XSD_PORTAL_URL);
                String publicationCodeFolder = UtilsPatent.createFolder(
                        publicationCode, numberXmlFolder);
                File patentFile = UtilsPatent.createFile(
                        fileName.fullFileName(publication),
                        publicationCodeFolder);
                marshaller.marshal(bgPatentDocuments, patentFile);
            } catch (JAXBException e) {
                log.error(e.getMessage(), e);
                e.printStackTrace();
                throw new Exception(e.getMessage(), e);
            }
        }
    }

    private void exportToPdf(List<CPatentsPublication> publicationList, String publicationCode, List<String> errors) throws Exception {
        for (CPatentsPublication publication : publicationList) {
            List<CPatentAttachment> patentAttachments = publication.getPtappli().getPatentAttachments();
            if (!CollectionUtils.isEmpty(patentAttachments)) {
                CPatentAttachment validAttachment;
                switch (publicationCode) {
                    case PUB_CODE_A:
                        validAttachment = patentAttachments.stream().filter(x -> x.getPatentAttachmentType().getId().equals(4)).max(Comparator.comparing(CPatentAttachment::getDateCreated)).orElse(null);
                        break;
                    case PUB_CODE_B1:
                        validAttachment = patentAttachments.stream().filter(x -> x.getPatentAttachmentType().getId().equals(5)).max(Comparator.comparing(CPatentAttachment::getDateCreated)).orElse(null);
                        break;
                    case PUB_CODE_U1:
                        validAttachment = patentAttachments.stream().filter(x -> x.getPatentAttachmentType().getId().equals(7)).max(Comparator.comparing(CPatentAttachment::getDateCreated)).orElse(null);
                        break;
                    default:
                        log.error("Unrecognized publicationCode: " + publicationCode);
                        throw new RuntimeException("Unrecognized publicationCode: " + publicationCode);
                }

                if (Objects.nonNull(validAttachment)) {
                    if (Objects.nonNull(validAttachment.getContent())) {
                        List<CPdfBookmark> pdfBookmarks = pdfBookmarkService.getPdfBookmarks(validAttachment.getContent());
                        if (!CollectionUtils.isEmpty(pdfBookmarks) && pdfBookmarks.size() >= 4 &&
                                pdfBookmarks.get(0).getBookmarkName().equals("Bibliographic data") &&
                                pdfBookmarks.get(1).getBookmarkName().equals("Abstract") &&
                                pdfBookmarks.get(2).getBookmarkName().equals("Description") &&
                                pdfBookmarks.get(3).getBookmarkName().equals("Claims")) {
                            try {
                                String publicationCodeFolder = UtilsPatent.createFolder(publicationCode, numberPdfFolder);
                                File file = new File(publicationCodeFolder + "/" + fileName.fullFileName(publication) + ".pdf");
                                OutputStream out = new FileOutputStream(file.getPath());
                                out.write(validAttachment.getContent());
                                out.close();
                            } catch (IOException e) {
                                log.error(e.getMessage(), e);
                                e.printStackTrace();
                                throw new Exception(e.getMessage(), e);
                            }
                        } else {
                            errors.add("Images/" + publicationCode + "/" + fileName.fullFileName(publication) + ": Image file has incorrect bookmarks");
                        }

                    } else {
                        errors.add("Images/" + publicationCode + "/" + fileName.fullFileName(publication) + ": Image file has no content");
                    }
                } else {
                    errors.add("Images/" + publicationCode + "/" + fileName.fullFileName(publication) + ": Missing image file");
                }
            } else {
                errors.add("Images/" + publicationCode + "/" + fileName.fullFileName(publication) + ": Missing image file");
            }
        }
    }

}
