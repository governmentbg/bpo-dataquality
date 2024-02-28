package bg.duosoft.patentsexporter.domain.entity.bpo_online.legaldecisions;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "document", schema = "legal_decisions")
public class DocumentEntity implements Serializable {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "document_seq", schema = "legal_decisions", sequenceName = "document_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_seq")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "doc_type")
    private DocumentTypeEntity documentType;

    @ManyToOne
    @JoinColumn(name = "legal_ground_type", referencedColumnName = "id")
    private LegalGroundTypeEntity legalGroundType;

    @Column(name = "doc_num")
    private Integer docNum;

    @Column(name = "doc_date")
    private LocalDate docDate;

    @Column(name = "idappli")
    private String idappli;

    @Column(name = "title")
    private String title;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "doc_id", insertable = false, updatable = false)
    private List<DocumentContentEntity> docContents;
}
