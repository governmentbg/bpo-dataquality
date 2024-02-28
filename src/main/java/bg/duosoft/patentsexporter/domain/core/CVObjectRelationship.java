package bg.duosoft.patentsexporter.domain.core;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CVObjectRelationship {
    private String idappli;
    private String relationshipTyp;
    private String applicationTyp;
    private String idappliReference;
    private String relationshipName;
    private String relationshipNameEn;
    private String description;
    private String descriptionEn;
    private String registrationNumber;
    private String referenceKey;
    private LocalDate registrationDate;
    private String registrationCountry;
    private LocalDate cancellattionDate;
    private LocalDate priorityDate;
    private LocalDate serveMessageDate;
}
