package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "priority", schema = "patents")
public class PatentsPriorityEntity implements Serializable {

    @EmbeddedId
    private PatentsPriorityEntityPK pk;

    @Column(name = "dtprio")
    private LocalDate dtprio;

    @Column(name = "idcountry")
    private String idcountry;

    @Column(name = "noprio")
    private String noprio;

    @Column(name = "rmprio")
    private String rmprio;

    @Column(name = "stprio")
    private Integer stprio;

    @Column(name = "typrio")
    private Integer typrio;

}
