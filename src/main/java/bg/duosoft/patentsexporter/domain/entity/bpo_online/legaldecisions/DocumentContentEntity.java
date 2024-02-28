package bg.duosoft.patentsexporter.domain.entity.bpo_online.legaldecisions;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.blobs.BlobEntity;
import javax.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "document_content", schema = "legal_decisions")
public class DocumentContentEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "document_content_id_seq", schema = "legal_decisions", sequenceName = "document_content_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_content_id_seq")
    private Integer id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "blob_id", insertable = true, updatable = true)
    private BlobEntity blob;

    @Column(name = "doc_id")
    private Integer docId;
}
