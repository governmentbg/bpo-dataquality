package bg.duosoft.patentsexporter.domain.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CAbstract {
    private String idappli;
    private byte[] abstract_;
    private String txtform;
    private String txtformtr;
}
