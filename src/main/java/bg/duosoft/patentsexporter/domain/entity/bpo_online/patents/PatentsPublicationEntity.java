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
@Table(name = "publication", schema = "patents")
public class PatentsPublicationEntity implements Serializable {

    @EmbeddedId
    private PatentsPublicationEntityPK pk;

    @Column(name = "nogazette")
    private String nogazette;

    @Column(name = "yygazette")
    private Integer yygazette;

    @OneToOne
    @JoinColumn(name = "nosect", insertable = false, updatable = false)
    private PatentsPublisectEntity publisect;

    @Column(name = "typubli")
    private String typubli;

    @Column(name = "dttopubli")
    private LocalDate dttopubli;

    @Column(name = "rmpubli")
    private String rmpubli;

}
