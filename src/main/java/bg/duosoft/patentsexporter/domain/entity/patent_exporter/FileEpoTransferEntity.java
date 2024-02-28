package bg.duosoft.patentsexporter.domain.entity.patent_exporter;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "file_epo_transfer", schema = "public")
public class FileEpoTransferEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "data_type")
    private String dataType;

    @Column(name = "transfer_user")
    private String transferUser;

    @Column(name = "transfer_date")
    private LocalDateTime transferDate;

    @Column(name = "delivery_id")
    private String deliveryId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "is_partial")
    private Boolean isPartial;

    @Column(name = "partial_date_from")
    private LocalDate partialDateFrom;

    @Column(name = "partial_date_to")
    private LocalDate partialDateTo;

    @Column(name = "epo_status")
    private String epoStatus;

    @Column(name = "epo_validation_errors")
    private String epoValidationErrors;

    @Column(name = "error_message")
    private String errorMessage;
}