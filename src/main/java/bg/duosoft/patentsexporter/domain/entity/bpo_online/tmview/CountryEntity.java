package bg.duosoft.patentsexporter.domain.entity.bpo_online.tmview;

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
@Table(name = "country", schema = "tmview")
public class CountryEntity implements Serializable {

    @Id
    @Column(name = "idcountry")
    private String idcountry;

    @Column(name = "adrformat")
    private Integer adrformat;

    @Column(name = "engnmcountry")
    private String engnmcountry;

    @Column(name = "epcmember")
    private Integer epcmember;

    @Column(name = "madridagree")
    private Integer madridagree;

    @Column(name = "nmcountry")
    private String nmcountry;

    @Column(name = "paylevel")
    private Integer paylevel;

    @Column(name = "pctmember")
    private Integer pctmember;
}
