package bg.duosoft.patentsexporter.converter;

import bg.duosoft.patentsexporter.domain.core.CAbstract;
import bg.duosoft.patentsexporter.domain.core.CPatentsPublication;
import bg.duosoft.patentsexporter.domain.core.CPtAppli;
import bg.duosoft.patentsexporter.domain.jaxb.generated.Abstract;
import bg.duosoft.patentsexporter.domain.jaxb.generated.BgPatentDocument;
import bg.duosoft.patentsexporter.domain.jaxb.generated.P;
import bg.duosoft.patentsexporter.service.AbstractService;
import bg.duosoft.patentsexporter.service.PtAppliService;
import bg.duosoft.patentsexporter.util.UtilsPatent;
import bg.duosoft.patentsexporter.zip.FileName;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class BgPatentDocumentConverter implements Serializable {
    private final BibliographicDataConverter bibliographicDataConverter;

    private final PtAppliService ptappliService;

    private final FileName fileName;

    private final AbstractService abstractService;

    public BgPatentDocument bgPatentConvert(CPatentsPublication publication, boolean isTransliterate) {
        String publicationIdappli = publication.getPtappli().getIdAppli();
        BgPatentDocument bgPatent = new BgPatentDocument();
        CPtAppli ptapli = ptappliService.getPtappliByIdappli(publicationIdappli);
        if (ptapli != null)
            bgPatent.setId(ptapli.getIdAppli());
        bgPatent.setFile(fileName.fullFileName(publication));
        bgPatent.setCountry("BG");
        bgPatent.setDocNumber(fileName.fullFileName(publication));
        bgPatent.setKind(fileName.fileNameSuffix(publication));
        if (!isTransliterate)
            bgPatent.setLang("bg");
        else
            bgPatent.setLang("en");
        bgPatent.setDatePubl(UtilsPatent.getDateAsString(publication.getDttopubli()));
        bgPatent.setBibliographicData(bibliographicDataConverter.setBibliographicData(publication, isTransliterate));
        bgPatent.getAbstract().addAll(abstractTag(publicationIdappli, isTransliterate));
        return bgPatent;
    }

    private List<Abstract> abstractTag(String idappli, boolean isTransliterate) {
        List<Abstract> abstractList = new ArrayList<>();
        CAbstract abstractBydappli = abstractService.getAbstractByIdappli(idappli);
        Abstract abstractBG = new Abstract();
        P pBG = new P();
        if (abstractBydappli != null) {
            if (!isTransliterate) {
                String txtform = abstractBydappli.getTxtform();
                if (txtform != null && txtform.length() > 0)
                    pBG.setContent(txtform);
                else
                    pBG.setContent("Not available in Bulgarian language.");
                abstractBG.setLang("bg");
            } else {
                String txtformtr = abstractBydappli.getTxtformtr();
                if (txtformtr != null && txtformtr.length() > 0)
                    pBG.setContent(txtformtr);
                else
                    pBG.setContent("Not available in English language.");
                abstractBG.setLang("en");
            }
            abstractBG.getP().add(pBG);
        } else {
            if (!isTransliterate) {
                pBG.setContent("Not available in Bulgarian language.");
                abstractBG.setLang("bg");
            } else {
                pBG.setContent("Not available in English language.");
                abstractBG.setLang("en");
            }
            abstractBG.getP().add(pBG);
        }
        abstractList.add(abstractBG);
        return abstractList;
    }

}
