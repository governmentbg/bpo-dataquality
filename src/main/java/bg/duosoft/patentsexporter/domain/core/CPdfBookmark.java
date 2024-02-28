package bg.duosoft.patentsexporter.domain.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CPdfBookmark {
    private String bookmarkName;
    private Integer pageNumber;
}
