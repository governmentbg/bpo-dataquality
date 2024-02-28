package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CPatentsPublisect;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsPublisectEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PatentsPublisectMapper extends BaseObjectMapper<PatentsPublisectEntity, CPatentsPublisect> {

}
