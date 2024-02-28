package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CPatentsIpcClass {
    private Integer ipcEditionCode;
    private String ipcSectionCode;
    private String ipcClassCode;
    private String ipcSubclassCode;
    private String ipcGroupCode;
    private String ipcSubgroupCode;
    private String ipcName;
    private String shortIpcClass;
}
