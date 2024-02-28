package bg.duosoft.patentsexporter.zip;

import bg.duosoft.patentsexporter.domain.core.CPatentsPublication;
import bg.duosoft.patentsexporter.domain.core.CPtAppli;
import bg.duosoft.patentsexporter.service.PatentsPublicationService;
import bg.duosoft.patentsexporter.service.PatentsPublisectService;
import bg.duosoft.patentsexporter.service.PtAppliService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FileName {

    private final PatentsPublicationService publicationService;

    private final PatentsPublisectService publisectService;

    private final PtAppliService ptappliService;

    public String fileNamePrefix(CPatentsPublication publication) {
        Integer nosect = publication.getPublisect().getIdsection();
        String idappli = publication.getPtappli().getIdAppli();
        String fileNamePrefix = null;
        if (nosect == 1) {
            fileNamePrefix = idappli.substring(4,
                    idappli.length() - 1);
        } else {
            CPtAppli ptappliByIdappli = ptappliService.getPtappliByIdappli(idappli);
            String idpatent = ptappliByIdappli.getIdPatent();
            if (idpatent != null)
                fileNamePrefix = idpatent;
//				fileNamePrefix = UtilsPatent.toSixNumbers(idpatent);
        }
        return fileNamePrefix;
    }

    public String fileNameSuffix(CPatentsPublication publication) {
        String fileNameSuffix = null;
        String publCodeByNosect = publisectService.getPublCodeByNosect(publication.getPublisect().getIdsection());
        if (publCodeByNosect != null)
            fileNameSuffix = publCodeByNosect;
        else
            fileNameSuffix = "";
        return fileNameSuffix;
    }


    public String fullFileName(CPatentsPublication publication) {
//		String fileName = fileNamePrefix(publication) + fileNameSuffix(publication);
        String fileName = fileNamePrefix(publication);
        return fileName;

    }

}
