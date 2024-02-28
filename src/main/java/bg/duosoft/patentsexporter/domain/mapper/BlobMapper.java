package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CBlob;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.blobs.BlobEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class BlobMapper extends BaseObjectMapper<BlobEntity, CBlob> {

}
