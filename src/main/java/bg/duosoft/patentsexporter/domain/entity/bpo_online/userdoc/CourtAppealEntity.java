package bg.duosoft.patentsexporter.domain.entity.bpo_online.userdoc;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "court_appeal", schema = "userdoc")
public class CourtAppealEntity implements Serializable {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "appeal_seq", schema = "userdoc", sequenceName = "appeal_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appeal_seq")
    private Integer id;

    @Column(name = "userdoc_idappli")
    private String userdocIdappli;

    @Column(name = "court")
    private String court;

    @Column(name = "court_case_number")
    private String courtCaseNumber;

    @Column(name = "court_case_date")
    private LocalDate courtCaseDate;

    @Column(name = "judicial_act_number")
    private String judicialActNumber;

    @Column(name = "judicial_act_date")
    private LocalDate judicialActDate;

    @Column(name = "judicial_act_type")
    private String judicialActType;

    @Column(name = "court_link")
    private String courtLink;
}
