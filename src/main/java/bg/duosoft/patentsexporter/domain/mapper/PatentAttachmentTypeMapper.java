package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CPatentAttachmentType;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.PatentAttachmentTypeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PatentAttachmentTypeMapper extends BaseObjectMapper<PatentAttachmentTypeEntity, CPatentAttachmentType> {

}
