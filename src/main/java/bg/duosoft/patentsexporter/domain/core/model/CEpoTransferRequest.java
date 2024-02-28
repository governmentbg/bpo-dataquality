package bg.duosoft.patentsexporter.domain.core.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

import bg.duosoft.patentsexporter.epo.model.PublicationFile.DataTypeEnum;

@Data
@Builder
public class CEpoTransferRequest {
    private String fileName;
    private byte[] fileContent;
    private String fileContentType;
    private DataTypeEnum dataType;
    private Boolean isPartial;
    private LocalDate dateFrom;
    private LocalDate dateTo;
}
