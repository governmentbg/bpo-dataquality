package bg.duosoft.patentsexporter.domain.core.epo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CFileEpoTransfer {
    private Integer id;
    private bg.duosoft.patentsexporter.epo.model.PublicationFile.DataTypeEnum dataType;
    private String transferUser;

    private LocalDateTime transferDate;

    private String deliveryId;

    private String fileName;

    private Boolean isPartial;

    private LocalDate partialDateFrom;

    private LocalDate partialDateTo;

    private String epoStatus;

    private String epoValidationErrors;

    private String errorMessage;
}
