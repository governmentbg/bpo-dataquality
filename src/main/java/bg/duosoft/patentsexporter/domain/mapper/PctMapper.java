package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CPct;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PctEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PctMapper extends BaseObjectMapper<PctEntity, CPct> {

}
