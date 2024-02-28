package bg.duosoft.patentsexporter.domain.entity.bpo_online.blobs;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
@Table(name = "blobs", schema = "blobs")
public class BlobEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "filename")
    private String fileName;

    @Column(name = "content_type")
    private String contentType;

    @Column(name = "filesize")
    private Integer fileSize;

    @Column(name = "content")
    private byte[] content;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "created_user_id")
    private Long createdUserId;
}
