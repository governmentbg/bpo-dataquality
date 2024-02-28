package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "backoffice_pt_status_map", schema = "patents")
public class BackofficePtStatusMapEntity implements Serializable {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="backoffice_status_id")
    private Integer backofficeStatusId;

    @Column(name="backoffice_status_name")
    private String backofficeStatusName;

    @Column(name="bpo_online_status")
    private String bpoOnlineStatus;

    @Column(name="bpo_online_status_en")
    private String bpoOnlineStatusEn;

    @Column(name="for_deletion")
    private Integer forDeletion;

    @Column(name = "status_category")
    private String statusCategory;
}
