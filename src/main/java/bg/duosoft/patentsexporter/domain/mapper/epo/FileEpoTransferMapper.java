package bg.duosoft.patentsexporter.domain.mapper.epo;

import bg.duosoft.patentsexporter.domain.core.epo.CFileEpoTransfer;
import bg.duosoft.patentsexporter.domain.entity.patent_exporter.FileEpoTransferEntity;
import bg.duosoft.patentsexporter.domain.mapper.BaseObjectMapper;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public abstract class FileEpoTransferMapper extends BaseObjectMapper<FileEpoTransferEntity, CFileEpoTransfer> {

}
