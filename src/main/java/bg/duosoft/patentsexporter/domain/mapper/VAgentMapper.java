package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CVAgent;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.VAgentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class VAgentMapper extends BaseObjectMapper<VAgentEntity, CVAgent> {

}
