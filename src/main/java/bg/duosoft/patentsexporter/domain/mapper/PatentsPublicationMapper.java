package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CPatentsPublication;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsPublicationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PatentsPublisectMapper.class, PtAppliMapper.class})
public abstract class PatentsPublicationMapper extends BaseObjectMapper<PatentsPublicationEntity, CPatentsPublication> {

    @Mapping(target = "ptappli", source = "pk.ptappli")
    @Mapping(target = "odhisto", source = "pk.odhisto")
    public abstract CPatentsPublication toCore(PatentsPublicationEntity e);

}
