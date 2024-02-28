package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "publisect", schema = "patents")
public class PatentsPublisectEntity implements Serializable {

    @Id
    private Integer idsection;

    @Column(name = "nmsection")
    private String nmsection;

    @Column(name = "nmsection_en")
    private String nmsectionEn;

    @Column(name = "is_searchable")
    private Short isSearchable;

    @Column(name = "publ_code")
    private String publCode;

}
