package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CClassin {
    private CPtAppli ptAppli;
    private Integer odClass;
    private Integer ipcVersion;
    private String ipcClass;
    private Integer odLink;
    private Integer tyIpcClass;
//    private CPatentsIpcClass ipcClassRef;
    private String shortIpcClass;
}
