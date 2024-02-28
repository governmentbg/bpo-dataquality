package bg.duosoft.patentsexporter.domain.core;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PtAppliEntity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CPatentsPriority {
    private PtAppliEntity ptappli;
    private Integer odprio;
    private LocalDate dtprio;
    private String idcountry;
    private String noprio;
    private String rmprio;
    private Integer stprio;
    private Integer typrio;
}
