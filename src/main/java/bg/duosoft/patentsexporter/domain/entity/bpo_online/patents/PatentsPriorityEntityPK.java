package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PatentsPriorityEntityPK implements Serializable {

    @Column(name = "odprio")
    private Integer odprio;

    @ManyToOne
    @JoinColumn(name = "idappli", insertable = false, updatable = false)
    private PtAppliEntity ptappli;
}
