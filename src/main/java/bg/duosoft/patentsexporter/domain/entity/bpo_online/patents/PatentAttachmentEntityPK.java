package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.PatentAttachmentTypeEntity;
import javax.persistence.*;

import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PatentAttachmentEntityPK implements Serializable {

    @Column(name = "idappli")
    private String idappli;

    @Column(name = "attachmentid")
    private Integer attachmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attachment_type_id", referencedColumnName = "id", insertable = false, updatable = false)
    private PatentAttachmentTypeEntity patentAttachmentType;

}
