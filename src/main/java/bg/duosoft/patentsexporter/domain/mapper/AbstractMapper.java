package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CAbstract;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.AbstractEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AbstractMapper extends BaseObjectMapper<AbstractEntity, CAbstract> {

}
