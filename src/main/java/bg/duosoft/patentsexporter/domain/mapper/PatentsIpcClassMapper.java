package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CPatentsIpcClass;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsIpcClassEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class PatentsIpcClassMapper extends BaseObjectMapper<PatentsIpcClassEntity, CPatentsIpcClass> {

    @Mapping(target = "ipcEditionCode", source = "pk.ipcEditionCode")
    @Mapping(target = "ipcSectionCode", source = "pk.ipcSectionCode")
    @Mapping(target = "ipcClassCode", source = "pk.ipcClassCode")
    @Mapping(target = "ipcSubclassCode", source = "pk.ipcSubclassCode")
    @Mapping(target = "ipcGroupCode", source = "pk.ipcGroupCode")
    @Mapping(target = "ipcSubgroupCode", source = "pk.ipcSubgroupCode")
    public abstract CPatentsIpcClass toCore(PatentsIpcClassEntity e);

}
