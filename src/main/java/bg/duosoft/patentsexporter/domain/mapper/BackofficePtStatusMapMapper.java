package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CBackofficePtStatusMap;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.BackofficePtStatusMapEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class BackofficePtStatusMapMapper extends BaseObjectMapper<BackofficePtStatusMapEntity, CBackofficePtStatusMap> {

}
