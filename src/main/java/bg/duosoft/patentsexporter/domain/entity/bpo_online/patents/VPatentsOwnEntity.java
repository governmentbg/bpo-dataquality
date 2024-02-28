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
@Table(name = "vw_own", schema = "patents")
public class VPatentsOwnEntity implements Serializable {

    @EmbeddedId
    private VPatentsOwnEntityPK pk;

    @Column(name = "odowner")
    private Integer odowner;

}
