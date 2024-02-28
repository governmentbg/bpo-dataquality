package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.tmview.CountryEntity;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CountryRepository extends BaseRepository<CountryEntity, String> {

    @Query("SELECT c.engnmcountry FROM CountryEntity c WHERE c.idcountry = :idCountry")
    String getEngCountryNameByCode(@Param("idCountry") String idCountry);

}
