package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CUserdoc {
    private String userdocIdappli;
    private String objectIdappli;
    private String incomingNumber;
    private LocalDate filingDate;
    private String applicant;
    private String status;
    private List<CCourtAppeal> courtAppeals;
}
