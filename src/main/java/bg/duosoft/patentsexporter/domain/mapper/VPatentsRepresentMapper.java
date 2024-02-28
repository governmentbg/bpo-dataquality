package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CVPatentsRepresent;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VPatentsRepresentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PtAppliMapper.class, VAgentMapper.class})
public abstract class VPatentsRepresentMapper extends BaseObjectMapper<VPatentsRepresentEntity, CVPatentsRepresent> {

    @Mapping(target = "ptappli", source = "pk.ptappli")
    @Mapping(target = "agent", source = "pk.agent")
    public abstract CVPatentsRepresent toCore(VPatentsRepresentEntity e);

}
