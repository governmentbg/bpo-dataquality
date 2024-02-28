package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CBackofficePtStatusMap {
    private Integer id;
    private Integer backofficeStatusId;
    private String backofficeStatusName;
    private String bpoOnlineStatus;
    private String bpoOnlineStatusEn;
    private Integer forDeletion;
    private String statusCategory;
}
