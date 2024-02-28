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
@Table(name = "doc_type", schema = "legal_decisions")
public class DocumentTypeEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "doc_type_seq", schema = "legal_decisions", sequenceName = "doc_type_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_type_seq")
    private Integer id;

    @Column(name = "act_name")
    private String actName;
}
