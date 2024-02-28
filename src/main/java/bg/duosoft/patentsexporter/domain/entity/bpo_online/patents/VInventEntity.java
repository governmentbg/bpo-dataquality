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
@Table(name = "vw_invent", schema = "patents")
public class VInventEntity implements Serializable {

    @EmbeddedId
    private VInventEntityPK pk;

    @Column(name = "ordinvent")
    private Integer ordinvent;

}
