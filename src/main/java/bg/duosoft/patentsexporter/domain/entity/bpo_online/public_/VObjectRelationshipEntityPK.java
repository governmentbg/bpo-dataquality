package bg.duosoft.patentsexporter.domain.entity.bpo_online.public_;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class VObjectRelationshipEntityPK implements Serializable {

    @Column(name = "idappli")
    private String idappli;

    @Column(name = "relationship_typ")
    private String relationshipTyp;

    @Column(name = "application_typ")
    private String applicationTyp;

    @Column(name = "idappli_reference")
    private String idappliReference;

}
