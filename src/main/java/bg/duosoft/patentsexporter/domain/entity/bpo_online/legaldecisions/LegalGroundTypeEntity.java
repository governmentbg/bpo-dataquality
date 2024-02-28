package bg.duosoft.patentsexporter.domain.entity.bpo_online.legaldecisions;

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
@Table(name = "legal_ground_type", schema = "legal_decisions")
public class LegalGroundTypeEntity implements Serializable {

    @Id
    private Integer id;

    @Column(name = "description")
    private String description;
}
