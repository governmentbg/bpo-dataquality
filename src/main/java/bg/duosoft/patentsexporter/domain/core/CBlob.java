package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CBlob {
    private Integer id;
    private String fileName;
    private String contentType;
    private Integer fileSize;
    private byte[] content;
    private LocalDate createdDate;
    private Long createdUserId;
}
