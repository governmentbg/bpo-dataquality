package bg.duosoft.patentsexporter.domain.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CVInvent {
//    private String idappli;
//    private Integer idinvent;
    private Integer ordinvent;
    private CPtAppli ptappli;
    private CVOwner inventor;
}
