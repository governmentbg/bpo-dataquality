package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CLegalGroundType;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.legaldecisions.LegalGroundTypeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class LegalGroundTypeMapper extends BaseObjectMapper<LegalGroundTypeEntity, CLegalGroundType> {

}
