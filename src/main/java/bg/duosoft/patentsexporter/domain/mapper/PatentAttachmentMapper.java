package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CPatentAttachment;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentAttachmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PatentAttachmentTypeMapper.class})
public abstract class PatentAttachmentMapper extends BaseObjectMapper<PatentAttachmentEntity, CPatentAttachment> {

    @Mapping(target = "idappli", source = "pk.idappli")
    @Mapping(target = "attachmentId", source = "pk.attachmentId")
    @Mapping(target = "patentAttachmentType", source = "pk.patentAttachmentType")
    public abstract CPatentAttachment toCore(PatentAttachmentEntity e);

}
