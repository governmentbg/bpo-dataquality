package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CPatentsPublication {
    private CPtAppli ptappli;
    private Integer odhisto;
    private String nogazette;
    private Integer yygazette;
    private CPatentsPublisect publisect;
    private String typubli;
    private LocalDate dttopubli;
    private String rmpubli;
}
