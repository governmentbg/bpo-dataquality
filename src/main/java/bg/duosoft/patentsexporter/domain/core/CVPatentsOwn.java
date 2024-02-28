package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CVPatentsOwn {
    private CPtAppli ptappli;
    private CVOwner owner;
    private Integer odowner;
}
