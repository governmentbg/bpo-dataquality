package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CDocument;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.legaldecisions.DocumentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DocumentTypeMapper.class, LegalGroundTypeMapper.class, DocumentContentMapper.class})
public abstract class DocumentMapper extends BaseObjectMapper<DocumentEntity, CDocument> {

}
