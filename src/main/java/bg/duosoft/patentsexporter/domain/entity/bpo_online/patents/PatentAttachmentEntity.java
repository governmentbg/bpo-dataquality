package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import javax.persistence.*;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "patent_attachment", schema = "patents")
public class PatentAttachmentEntity implements Serializable {

    @EmbeddedId
    private PatentAttachmentEntityPK pk;

    @Column(name = "attachment_name")
    private String attachmentName;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "attachment_content")
    private byte[] content;
}
