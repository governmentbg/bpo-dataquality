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
@Table(name = "classin", schema = "patents")
public class ClassinEntity implements Serializable {

    @EmbeddedId
    private ClassinEntityPK pk;

    @Column(name = "ipcversion")
    private Integer ipcVersion;

    @Column(name = "ipcclass")
    private String ipcClass;

    @Column(name = "odlink")
    private Integer odLink;

    @Column(name = "tyipcclass")
    private Integer tyIpcClass;

    //Cannot be mapped - ipc_edition_code is missing
//    @ManyToOne
//    @PrimaryKeyJoinColumns(value = {
//            @PrimaryKeyJoinColumn(name = "ipc_section_code", referencedColumnName = "ipc_section_code"),
//            @PrimaryKeyJoinColumn(name = "ipc_class_code", referencedColumnName = "ipc_class_code"),
//            @PrimaryKeyJoinColumn(name = "ipc_subclass_code", referencedColumnName = "ipc_subclass_code"),
//            @PrimaryKeyJoinColumn(name = "ipc_group_code", referencedColumnName = "ipc_group_code"),
//            @PrimaryKeyJoinColumn(name = "ipc_subgroup_code", referencedColumnName = "ipc_subgroup_code"),
//    })
//    private PatentsIpcClassEntity ipcClassRef;

    @Column(name = "short_ipcclass")
    private String shortIpcClass;
}
