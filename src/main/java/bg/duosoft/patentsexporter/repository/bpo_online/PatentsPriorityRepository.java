package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsPriorityEntity;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PatentsPriorityEntityPK;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatentsPriorityRepository extends BaseRepository<PatentsPriorityEntity, PatentsPriorityEntityPK> {

    @Query("SELECT c FROM PatentsPriorityEntity c WHERE c.pk.ptappli.idAppli = :idappli")
    List<PatentsPriorityEntity> getPriorityListByIdappli(@Param("idappli") String idappli);

}
