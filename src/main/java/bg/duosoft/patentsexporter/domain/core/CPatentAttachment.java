package bg.duosoft.patentsexporter.domain.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CPatentAttachment {
    private String idappli;
    private Integer attachmentId;
    private CPatentAttachmentType patentAttachmentType;
    private String attachmentName;
    private LocalDateTime dateCreated;
    private byte[] content;
}
