package bg.duosoft.patentsexporter.domain.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CDocumentContent {
    private Integer id;
    private CBlob blob;
    private Integer docId;
}
