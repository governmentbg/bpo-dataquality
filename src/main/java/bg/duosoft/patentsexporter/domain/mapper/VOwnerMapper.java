package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CVOwner;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.VOwnerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class VOwnerMapper extends BaseObjectMapper<VOwnerEntity, CVOwner> {

}
