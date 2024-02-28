package bg.duosoft.patentsexporter.domain.mapper;

import bg.duosoft.patentsexporter.domain.core.CCountry;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.tmview.CountryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CountryMapper extends BaseObjectMapper<CountryEntity, CCountry> {

}
