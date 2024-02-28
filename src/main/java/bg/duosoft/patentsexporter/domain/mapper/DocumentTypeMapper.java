package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CDocumentType;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.legaldecisions.DocumentTypeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class DocumentTypeMapper extends BaseObjectMapper<DocumentTypeEntity, CDocumentType> {

}
