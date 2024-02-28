package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CVPatentsRepresent {
    private CVAgent agent;
    private CPtAppli ptappli;
    private Integer odagent;
}
