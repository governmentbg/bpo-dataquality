package bg.duosoft.patentsexporter.converter;

import bg.duosoft.patentsexporter.domain.core.*;
import bg.duosoft.patentsexporter.domain.jaxb.generated.*;
import bg.duosoft.patentsexporter.service.*;
import bg.duosoft.patentsexporter.util.UtilsPatent;
import bg.duosoft.patentsexporter.zip.FileName;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class BibliographicDataConverter {

    private final PartiesConverter partiesConverter;

    private final PtAppliService ptAppliService;

    private final ClassinService classinService;

    private final PctService pctService;

    private final FileName fileName;

    private final PatentsPriorityService priorityService;

    private final PatentsPublicationService patentsPublicationService;

    public BibliographicData setBibliographicData(CPatentsPublication publication, boolean isTransliterate) {
        String publicationIdappli = publication.getPtappli().getIdAppli();
        BibliographicData bibliographicData = new BibliographicData();
        if (!isTransliterate)
            bibliographicData.setLang("bg");
        else
            bibliographicData.setLang("en");
        bibliographicData.setCountry("BG");
        bibliographicData.setStatus("published");
        bibliographicData.setPublicationReference(publicationReference(publication, isTransliterate));
        List<CClassin> classinList = classinService.getClassinListByIdappli(publicationIdappli);
        if (classinList != null && classinList.size() > 0) {
            bibliographicData.setClassificationIpc(classificationIpc(classinList));
        }
        CPtAppli pttappli = ptAppliService.getPtappliByIdappli(publicationIdappli);
        bibliographicData.setApplicationReference(applicationReference(pttappli != null ? pttappli : null));
        bibliographicData.setLanguageOfFiling(languageOfFiling(isTransliterate));
        bibliographicData.setLanguageOfPublication(languageOfPublication(isTransliterate));
        List<CPatentsPriority> priorityList = priorityService.getPriorityListByIdappli(publicationIdappli);
        if (priorityList != null && priorityList.size() > 0) {
            bibliographicData.setPriorityClaims(priorityClaims(priorityList));
        }
        bibliographicData.getInventionTitle().add(inventionTitle(pttappli != null ? pttappli : null, isTransliterate));
        bibliographicData.setDatesRightsEffective(datesRightEffective(publication));
        bibliographicData.setFigures(figures(pttappli != null ? pttappli : null));
        bibliographicData.setNumberOfClaims(numberOfClaims(pttappli != null ? pttappli : null));

        bibliographicData.setParties(partiesConverter.parties(publication, isTransliterate));

        CPct pct = pctService.getPctByIdappli(publicationIdappli);
        bibliographicData.setPctOrRegionalFilingData(pctOrRegionalFilingData(pct != null ? pct : null));
        bibliographicData.setPctOrRegionalPublishingData(pctOrRegionalPublishingData(pct != null ? pct : null));
        return bibliographicData;
    }

    private PublicationReference publicationReference(CPatentsPublication publication, boolean isTransliterate) {
        Country country = new Country();
        country.setContent("BG");

        DocNumber docNumber = new DocNumber();
        docNumber.setContent(UtilsPatent.toSixNumbers(fileName.fileNamePrefix(publication)));

        Kind kind = new Kind();
        kind.setContent(fileName.fileNameSuffix(publication));

        Date date = new Date();
        date.setContent(UtilsPatent.getDateAsString(publication.getDttopubli()));

        DocumentId documentId = new DocumentId();
        documentId.setCountry(country);
        documentId.setDocNumber(docNumber);
        documentId.setKind(kind);
        documentId.setDate(date);
        if (!isTransliterate)
            documentId.setLang("bg");
        else
            documentId.setLang("en");

        PublicationReference publicationReference = new PublicationReference();
        publicationReference.setDocumentId(documentId);
        return publicationReference;
    }

    private ClassificationIpc classificationIpc(List<CClassin> classins) {
        if (classins == null || classins.size() == 0)
            return null;
        ClassificationIpc classificationIpc = new ClassificationIpc();
        List<FurtherClassification> furtherClassifications = new ArrayList<FurtherClassification>();
        Edition edition = new Edition();
        MainClassification mainClassification = new MainClassification();
        CClassin mainClassin = new CClassin();
        mainClassin.setOdClass(Integer.MAX_VALUE);
        for (CClassin classin : classins) {
            if (classin.getOdClass() < mainClassin.getOdClass())
                mainClassin = classin;
        }

        for (CClassin classin : classins) {
            if (classin.getOdClass() == mainClassin.getOdClass())
                mainClassification.setContent(classin.getIpcClass());
            else {
                FurtherClassification furtherClassification = new FurtherClassification();
                if (classin.getIpcClass() != null && classin.getIpcClass().length() > 0)
                    furtherClassification.setContent(classin.getIpcClass());
                furtherClassification.setSequence(String.valueOf(classin.getOdClass()));
                furtherClassifications.add(furtherClassification);
            }
        }
        edition.setContent(String.valueOf(classins.get(0).getIpcVersion()));
        classificationIpc.setEdition(edition);
        if (mainClassification.getContent() == null || mainClassification.getContent().length() < 1) {
            mainClassification.setContent("");
        }
        classificationIpc.setMainClassification(mainClassification);
        classificationIpc.getFurtherClassification().addAll(furtherClassifications);
        return classificationIpc;
    }

    private ApplicationReference applicationReference(CPtAppli ptappli) {
        if (ptappli == null)
            return null;
        ApplicationReference applicationReference = new ApplicationReference();

        Country country = new Country();
        country.setContent("BG");

        DocNumber docNumber = new DocNumber();
        String idappli = ptappli.getIdAppli();
        docNumber.setContent(idappli.substring(4, idappli.length() - 1));

        Date date = new Date();
        date.setContent(UtilsPatent.getDateAsString(ptappli.getDtAppli()));

        DocumentId documentId = new DocumentId();
        documentId.setDocNumber(docNumber);
        documentId.setCountry(country);
        documentId.setDate(date);

        applicationReference.setDocumentId(documentId);
        return applicationReference;
    }

    private LanguageOfFiling languageOfFiling(boolean isTransliterate) {
        LanguageOfFiling languageOfFiling = new LanguageOfFiling();
        if (!isTransliterate)
            languageOfFiling.setContent("bg");
        else
            languageOfFiling.setContent("en");

        return languageOfFiling;

    }

    private LanguageOfPublication languageOfPublication(boolean isTransliterate) {
        LanguageOfPublication languageOfPublication = new LanguageOfPublication();
        if (!isTransliterate)
            languageOfPublication.setContent("bg");
        else
            languageOfPublication.setContent("en");
        return languageOfPublication;
    }

    private PriorityClaims priorityClaims(List<CPatentsPriority> priorityList) {
        if (priorityList == null || priorityList.size() == 0)
            return null;
        PriorityClaims priorityClaims = new PriorityClaims();
        for (CPatentsPriority priority : priorityList) {
            Country country = new Country();
            country.setContent(priority.getIdcountry());

            DocNumber docNumber = new DocNumber();
            docNumber.setContent(priority.getNoprio());

            Date date = new Date();
            date.setContent(UtilsPatent.getDateAsString(priority.getDtprio()));

            PriorityClaim claim = new PriorityClaim();
            claim.setCountry(country);
            claim.setDocNumber(docNumber);
            claim.setDate(date);

            priorityClaims.getPriorityClaim().add(claim);
        }
        return priorityClaims;
    }

    private InventionTitle inventionTitle(CPtAppli ptappli, boolean isTransliterate) {
        if (ptappli == null)
            return null;
        InventionTitle inventionTitle = new InventionTitle();
        if (!isTransliterate) {
            inventionTitle.setLang("bg");
            inventionTitle.setContent(ptappli.getTitle());
        } else {
            inventionTitle.setLang("en");
            String engtitle = ptappli.getEngTitle();
            if (engtitle != null && engtitle.length() > 0)
                inventionTitle.setContent(engtitle);
            else
                inventionTitle.setContent("Not available in English language.");
        }
        return inventionTitle;

    }

    private DatesRightsEffective datesRightEffective(CPatentsPublication publication) {
        Date date = new Date();
        if (publication.getPtappli().getEffectiveDate() != null)
            date.setContent(UtilsPatent.getDateAsString(publication.getPtappli().getEffectiveDate()));
        else
            date.setContent("");
        DateEnteringIntoForce dateEnteringIntoForce = new DateEnteringIntoForce();
        dateEnteringIntoForce.setDate(date);

        DatesRightsEffective datesRightsEffective = new DatesRightsEffective();
        datesRightsEffective.getRequestForExaminationOrFirstExaminationReportDespatchedOrPatentMaintainedAsAmended().add(dateEnteringIntoForce);
        return datesRightsEffective;
    }

    private Figures figures(CPtAppli ptappli) {
        if (ptappli == null)
            return null;
        Figures figures = new Figures();

        NumberOfFigures numberOfFigures = new NumberOfFigures();
        numberOfFigures.setContent(String.valueOf(ptappli.getNbdraw()));

        figures.setNumberOfFigures(numberOfFigures);
        return figures;
    }

    private NumberOfClaims numberOfClaims(CPtAppli ptappli) {
        if (ptappli == null)
            return null;
        NumberOfClaims numberOfClaims = new NumberOfClaims();
        numberOfClaims.setContent(String.valueOf(ptappli.getNbclaim()));
        return numberOfClaims;
    }

    private PctOrRegionalFilingData pctOrRegionalFilingData(CPct pct) {
        if (pct == null)
            return null;
        Country country = new Country();
        if (pct.getPctPublicationCountryCode() != null)
            country.setContent(pct.getPctPublicationCountryCode());
        else
            country.setContent("");

        DocNumber docNumber = new DocNumber();
        if (pct.getPctApplicationId() != null)
            docNumber.setContent(pct.getPctApplicationId());
        else
            docNumber.setContent("");

        Date date = new Date();
        if (pct.getPctApplicationDate() != null)
            date.setContent(UtilsPatent.getDateAsString(pct.getPctApplicationDate()));
        else
            date.setContent("");

        DocumentId documentId = new DocumentId();
        documentId.setCountry(country);
        documentId.setDocNumber(docNumber);
        documentId.setDate(date);

        PctOrRegionalFilingData pctOrRegionalFilingData = new PctOrRegionalFilingData();
        pctOrRegionalFilingData.setDocumentId(documentId);
        return pctOrRegionalFilingData;
    }

    private PctOrRegionalPublishingData pctOrRegionalPublishingData(CPct pct) {
        if (pct == null)
            return null;
        Country country = new Country();
        if (pct.getPctPublicationCountryCode() != null)
            country.setContent(pct.getPctPublicationCountryCode());
        else
            country.setContent("");

        DocNumber docNumber = new DocNumber();
        if (pct.getPctPublicationId() != null)
            docNumber.setContent(pct.getPctPublicationId());
        else
            docNumber.setContent("");

        Date date = new Date();
        if (pct.getPctPublicationDate() != null)
            date.setContent(UtilsPatent.getDateAsString(pct.getPctPublicationDate()));
        else
            date.setContent("");

        DocumentId documentId = new DocumentId();
        documentId.setCountry(country);
        documentId.setDocNumber(docNumber);
        documentId.setDate(date);

        PctOrRegionalPublishingData pctOrRegionalPublishingData = new PctOrRegionalPublishingData();
        pctOrRegionalPublishingData.setDocumentId(documentId);
        return pctOrRegionalPublishingData;
    }

}
