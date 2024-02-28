package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.VObjectRelationshipEntity;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.legaldecisions.DocumentEntity;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.userdoc.UserdocEntity;
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
@Cacheable(false)
@Table(name = "ptappli", schema = "patents")
public class PtAppliEntity implements Serializable {

    @Id
    @Column(name = "idappli")
    private String idAppli;

    @Column(name = "idpatent")
    private String idPatent;

    @Column(name = "dtappli")
    private LocalDate dtAppli;

    @Column(name = "title")
    private String title;

    @Column(name = "engtitle")
    private String engTitle;

    @Column(name = "nbclaim")
    private Integer nbclaim;

    @Column(name = "nbdraw")
    private Integer nbdraw;

    @Column(name = "vipcmclass")
    private Integer vipcmclass;

    @Column(name = "ipcmclass")
    private String ipcMClass;

    @Column(name = "rmappli")
    private String rmAppli;

    @Column(name = "dtlgstappli")
    private LocalDate dtLgstAppli;

    @Column(name = "dtupdate")
    private LocalDate dtUpdate;

    @Column(name = "dtgrant")
    private LocalDate dtgrant;

    @Column(name = "dtptexpi")
    private LocalDate dtptexpi;

    @Column(name = "tyadrsce")
    private Integer tyadrsce;

    @Column(name = "extidappli")
    private String extidappli;

    @Column(name = "extidpatent")
    private String extidpatent;

    @Column(name = "ipcshort")
    private String ipcshort;

    @Column(name = "k_ptappli")
    private Integer kPtappli;

    @Column(name = "othertitle")
    private String otherTitle;

    @Column(name = "file_nbr")
    private Long fileNbr;

    @Column(name = "effective_date")
    private LocalDate effectiveDate;

    @Column(name = "not_in_force_date")
    private LocalDate notInForceDate;

    @Column(name = "renewal_fees_last_paid")
    private LocalDate renewalFeesLastPaid;

    @Column(name = "renewal_fees_paid_to")
    private LocalDate renewalFeesPaidTo;

    @Column(name = "last_paid_year")
    private Integer lastPaidYear;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idappli", referencedColumnName = "idappli")
    private AbstractEntity ptAbstract;

    @OneToMany
    @JoinColumn(name = "idappli", referencedColumnName = "idappli")
    private List<VObjectRelationshipEntity> relationships;

    @OrderBy("docNum DESC")
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "idappli")
    private List<DocumentEntity> legalDecisionsDocuments;

    @OneToMany
    @JoinColumn(name = "object_idappli", referencedColumnName = "idappli")
    private List<UserdocEntity> userdocs;

    @OrderBy("dateCreated DESC")
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "idappli")
    private List<PatentAttachmentEntity> patentAttachments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lgstappli", referencedColumnName = "backoffice_status_id")
    private BackofficePtStatusMapEntity status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pttyappli", insertable = false, updatable = false)
    private TyAppliEntity pttyappli;
}
