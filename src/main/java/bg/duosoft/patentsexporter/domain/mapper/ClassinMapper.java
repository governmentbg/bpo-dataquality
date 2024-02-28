package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CClassin;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.ClassinEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PatentsIpcClassMapper.class, PtAppliMapper.class})
public abstract class ClassinMapper extends BaseObjectMapper<ClassinEntity, CClassin> {

    @Mapping(target = "ptAppli", source = "pk.ptAppli")
    @Mapping(target = "odClass", source = "pk.odClass")
    public abstract CClassin toCore(ClassinEntity e);

//    @AfterMapping
//    protected void afterToEntity(CClassin source, @MappingTarget ClassinEntity target) {
//
//    }
}
