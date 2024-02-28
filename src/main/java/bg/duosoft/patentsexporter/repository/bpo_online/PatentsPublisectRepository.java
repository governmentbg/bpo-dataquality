package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsPublisectEntity;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatentsPublisectRepository extends BaseRepository<PatentsPublisectEntity, Integer> {

    @Query("SELECT c.publCode FROM PatentsPublisectEntity c WHERE c.idsection = :nosect")
    String getPublCodeByNosect(@Param("nosect") Integer nosect);

}
