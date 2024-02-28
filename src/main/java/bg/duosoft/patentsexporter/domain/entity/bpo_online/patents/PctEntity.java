package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "pct", schema = "patents")
public class PctEntity implements Serializable {

    @Id
    @Column(name = "idappli")
    private String idappli;

    @Column(name="pct_application_date")
    private LocalDate pctApplicationDate;

    @Column(name="pct_application_id")
    private String pctApplicationId;

    @Column(name="pct_phase")
    private Integer pctPhase;

    @Column(name="pct_publication_country_code")
    private String pctPublicationCountryCode;

    @Column(name="pct_publication_date")
    private LocalDate pctPublicationDate;

    @Column(name="pct_publication_id")
    private String pctPublicationId;
}
