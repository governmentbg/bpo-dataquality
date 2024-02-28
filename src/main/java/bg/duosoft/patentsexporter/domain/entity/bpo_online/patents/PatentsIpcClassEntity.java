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
@Table(name = "ipc_class", schema = "patents")
public class PatentsIpcClassEntity implements Serializable {

    @EmbeddedId
    private PatentsIpcClassEntityPK pk;

    @Column(name = "ipc_name")
    private String ipcName;

    @Column(name = "short_ipcclass")
    private String shortIpcClass;
}
