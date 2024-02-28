package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CPtAppli;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PtAppliEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AbstractMapper.class, VObjectRelationshipMapper.class, DocumentMapper.class,
        UserdocMapper.class, PatentAttachmentMapper.class, BackofficePtStatusMapMapper.class, TyAppliMapper.class})
public abstract class PtAppliMapper extends BaseObjectMapper<PtAppliEntity, CPtAppli> {

}
