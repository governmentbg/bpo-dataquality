package bg.duosoft.patentsexporter.domain.entity.bpo_online.public_;

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
@Table(name = "vw_object_relationships", schema = "public")
public class VObjectRelationshipEntity implements Serializable {

    @EmbeddedId
    private VObjectRelationshipEntityPK pk;

    @Column(name = "relationship_name")
    private String relationshipName;

    @Column(name = "relationship_name_en")
    private String relationshipNameEn;

    @Column(name = "description")
    private String description;

    @Column(name = "description_en")
    private String descriptionEn;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "reference_key")
    private String referenceKey;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @Column(name = "registration_country")
    private String registrationCountry;

    @Column(name = "cancellation_date")
    private LocalDate cancellattionDate;

    @Column(name = "priority_date")
    private LocalDate priorityDate;

    @Column(name = "serve_message_date")
    private LocalDate serveMessageDate;
}
