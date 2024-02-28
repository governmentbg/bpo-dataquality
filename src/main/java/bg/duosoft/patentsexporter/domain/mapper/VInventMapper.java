package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CVInvent;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VInventEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {PtAppliMapper.class, VOwnerMapper.class})
public abstract class VInventMapper extends BaseObjectMapper<VInventEntity, CVInvent> {

    @Mapping(target = "ptappli", source = "pk.ptappli")
    @Mapping(target = "inventor", source = "pk.inventor")
    public abstract CVInvent toCore(VInventEntity e);

//    @AfterMapping
//    protected void afterToEntity(CVInvent source, @MappingTarget VInventEntity target) {
//
//    }

}
