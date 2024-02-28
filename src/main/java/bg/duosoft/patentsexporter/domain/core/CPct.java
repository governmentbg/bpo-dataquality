package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CPct {
    private String idappli;
    private LocalDate pctApplicationDate;
    private String pctApplicationId;
    private Integer pctPhase;
    private String pctPublicationCountryCode;
    private LocalDate pctPublicationDate;
    private String pctPublicationId;
}
