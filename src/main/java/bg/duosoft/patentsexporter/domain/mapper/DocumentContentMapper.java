package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CDocumentContent;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.legaldecisions.DocumentContentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {BlobMapper.class})
public abstract class DocumentContentMapper extends BaseObjectMapper<DocumentContentEntity, CDocumentContent> {

}
