package bg.duosoft.patentsexporter.domain.entity.bpo_online.userdoc;

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
@Table(name = "userdoc", schema = "userdoc")
public class UserdocEntity implements Serializable {

    @Id
    @Column(name = "userdoc_idappli")
    private String userdocIdappli;

    @Column(name = "object_idappli")
    private String objectIdappli;

    @Column(name = "incoming_number")
    private String incomingNumber;

    @Column(name = "filing_date")
    private LocalDate filingDate;

    @Column(name = "applicant")
    private String applicant;

    @Column(name = "status")
    private String status;

    @OneToMany
    @JoinColumn(name = "userdoc_idappli", insertable = false, updatable = false)
    private List<CourtAppealEntity> courtAppeals;
}
