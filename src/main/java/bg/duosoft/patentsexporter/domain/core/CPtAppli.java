package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CPtAppli {
    private String idAppli;
    private String idPatent;
    private LocalDate dtAppli;
    private String title;
    private String engTitle;
    private Integer nbclaim;
    private Integer nbdraw;
    private Integer vipcmclass;
    private String ipcMClass;
    private String rmAppli;
    private LocalDate dtLgstAppli;
    private LocalDate dtUpdate;
    private LocalDate dtgrant;
    private LocalDate dtptexpi;
    private Integer tyadrsce;
    private String extidappli;
    private String extidpatent;
    private String ipcshort;
    private Integer kPtappli;
    private String otherTitle;
    private Long fileNbr;
    private LocalDate effectiveDate;
    private LocalDate notInForceDate;
    private LocalDate renewalFeesLastPaid;
    private LocalDate renewalFeesPaidTo;
    private Integer lastPaidYear;
    private CAbstract ptAbstract;
    private List<CVObjectRelationship> relationships;
    private List<CDocument> legalDecisionsDocuments;
    private List<CUserdoc> userdocs;
    private List<CPatentAttachment> patentAttachments;
    private CBackofficePtStatusMap status;
    private CTyAppli pttyappli;
}
