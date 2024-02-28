package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CTyObject;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.TyObjectEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TyObjectMapper extends BaseObjectMapper<TyObjectEntity, CTyObject> {

}
