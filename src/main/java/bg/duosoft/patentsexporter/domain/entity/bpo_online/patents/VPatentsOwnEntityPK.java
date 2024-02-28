package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.VOwnerEntity;
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
public class VPatentsOwnEntityPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "idappli", insertable = false, updatable = false)
    private PtAppliEntity ptappli;

    @ManyToOne
    @JoinColumn(name = "idowner", insertable = false, updatable = false)
    private VOwnerEntity owner;
}
