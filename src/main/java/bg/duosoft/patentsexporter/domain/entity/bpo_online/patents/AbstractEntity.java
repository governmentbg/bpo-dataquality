package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

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
@Table(name = "abstract", schema = "patents")
public class AbstractEntity implements Serializable {

    @Id
    @Column(name = "idappli")
    private String idappli;

    @Column(name = "abstract")
    private byte[] abstract_;

    @Column(name = "txtform")
    private String txtform;

    @Column(name = "txtformtr")
    private String txtformtr;
}
