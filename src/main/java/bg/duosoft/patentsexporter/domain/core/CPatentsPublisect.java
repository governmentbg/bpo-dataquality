package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CPatentsPublisect {
    private Integer idsection;
    private String nmsection;
    private String nmsectionEn;
    private Short isSearchable;
    private String publCode;
}
