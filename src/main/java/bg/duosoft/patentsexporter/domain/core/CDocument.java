package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CDocument {
    private Integer id;
    private CDocumentType documentType;
    private CLegalGroundType legalGroundType;
    private Integer docNum;
    private LocalDate docDate;
    private String idappli;
    private String title;
    private List<CDocumentContent> docContents;
}
