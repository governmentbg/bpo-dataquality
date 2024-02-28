package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "tyappli", schema = "patents")
public class TyAppliEntity implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "snvalue")
    private String snvalue;

    @Column(name = "descvalue")
    private String descvalue;

    @Column(name = "ipas_app_type")
    private String ipasAppType;

    @Column(name = "ipas_app_subtype")
    private String ipasAppSubtype;

    @OneToOne
    @JoinColumn(name = "tyobject", insertable = false, updatable = false)
    private TyObjectEntity tyObject;
}
