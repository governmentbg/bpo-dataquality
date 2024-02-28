package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CUserdoc;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.userdoc.UserdocEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CourtAppealMapper.class})
public abstract class UserdocMapper extends BaseObjectMapper<UserdocEntity, CUserdoc> {

}
