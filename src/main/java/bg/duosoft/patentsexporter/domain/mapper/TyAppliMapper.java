package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CTyAppli;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.TyAppliEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TyObjectMapper.class})
public abstract class TyAppliMapper extends BaseObjectMapper<TyAppliEntity, CTyAppli> {

}
