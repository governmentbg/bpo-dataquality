package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CVPatentsOwn;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VPatentsOwnEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PtAppliMapper.class, VOwnerMapper.class})
public abstract class VPatentsOwnMapper extends BaseObjectMapper<VPatentsOwnEntity, CVPatentsOwn> {

    @Mapping(target = "ptappli", source = "pk.ptappli")
    @Mapping(target = "owner", source = "pk.owner")
    public abstract CVPatentsOwn toCore(VPatentsOwnEntity e);

}
