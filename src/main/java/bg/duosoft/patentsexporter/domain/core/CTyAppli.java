package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CTyAppli {
    private Integer id;
    private String snvalue;
    private String descvalue;
    private String ipasAppType;
    private String ipasAppSubtype;
    private CTyObject tyObject;
}
