package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CCourtAppeal {
    private Integer id;
    private String userdocIdappli;
    private String court;
    private String courtCaseNumber;
    private LocalDate courtCaseDate;
    private String judicialActNumber;
    private LocalDate judicialActDate;
    private String judicialActType;
    private String courtLink;
}
