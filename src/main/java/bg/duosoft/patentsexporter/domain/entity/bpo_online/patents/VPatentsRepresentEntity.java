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
@Table(name = "vw_represent", schema = "patents")
public class VPatentsRepresentEntity implements Serializable {

    @EmbeddedId
    private VPatentsRepresentEntityPK pk;

    @Column(name = "odagent")
    private Integer odagent;

}
