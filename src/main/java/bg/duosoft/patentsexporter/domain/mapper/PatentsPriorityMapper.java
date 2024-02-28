package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CPatentsPriority;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsPriorityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PtAppliMapper.class})
public abstract class PatentsPriorityMapper extends BaseObjectMapper<PatentsPriorityEntity, CPatentsPriority> {

    @Mapping(target = "ptappli", source = "pk.ptappli")
    @Mapping(target = "odprio", source = "pk.odprio")
    public abstract CPatentsPriority toCore(PatentsPriorityEntity e);

}
