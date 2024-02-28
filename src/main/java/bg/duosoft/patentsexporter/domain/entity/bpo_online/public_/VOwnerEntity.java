package bg.duosoft.patentsexporter.domain.entity.bpo_online.public_;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "vw_owner", schema = "public")
public class VOwnerEntity implements Serializable {

    @Id
    private Integer idowner;

    @Column(name = "adowner")
    private String adowner;

    @Column(name = "emailowner")
    private String emailowner;

    @Column(name = "faxowner")
    private String faxowner;

    @Column(name = "fnowner")
    private String fnowner;

    @Column(name = "idcountry")
    private String idcountry;

    @Column(name = "idtown")
    private String idtown;

    @Column(name = "midnowner")
    private String midnowner;

    @Column(name = "nationown")
    private String nationown;

    @Column(name = "nmowner")
    private String nmowner;

    @Column(name = "nmstate")
    private String nmstate;

    @Column(name = "nmtown")
    private String nmtown;

    @Column(name = "ntincorp")
    private Integer ntincorp;

    @Column(name = "telowner")
    private String telowner;

    @Column(name = "titowner")
    private String titowner;

    @Column(name = "full_name_owner")
    private String fullNameOwner;

    //TODO NOT NEEDED FOR PT EXPORT
//    @OneToMany(mappedBy = "owner")
//    private List<Own> owns;
}
