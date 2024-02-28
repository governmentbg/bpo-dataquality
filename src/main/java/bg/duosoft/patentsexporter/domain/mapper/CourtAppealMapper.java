package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CCourtAppeal;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.userdoc.CourtAppealEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CourtAppealMapper extends BaseObjectMapper<CourtAppealEntity, CCourtAppeal> {

}
