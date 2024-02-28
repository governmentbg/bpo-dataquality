package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CVObjectRelationship;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.VObjectRelationshipEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class VObjectRelationshipMapper extends BaseObjectMapper<VObjectRelationshipEntity, CVObjectRelationship> {
    @Mapping(target = "idappli", source = "pk.idappli")
    @Mapping(target = "relationshipTyp", source = "pk.relationshipTyp")
    @Mapping(target = "applicationTyp", source = "pk.applicationTyp")
    @Mapping(target = "idappliReference", source = "pk.idappliReference")
    public abstract CVObjectRelationship toCore(VObjectRelationshipEntity e);
}
