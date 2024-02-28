package bg.duosoft.patentsexporter.domain.entity.bpo_online.patents;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PatentsIpcClassEntityPK implements Serializable {

    @Column(name = "ipc_edition_code")
    private Integer ipcEditionCode;

    @Column(name = "ipc_section_code")
    private String ipcSectionCode;

    @Column(name = "ipc_class_code")
    private String ipcClassCode;

    @Column(name = "ipc_subclass_code")
    private String ipcSubclassCode;

    @Column(name = "ipc_group_code")
    private String ipcGroupCode;

    @Column(name = "ipc_subgroup_code")
    private String ipcSubgroupCode;

}
