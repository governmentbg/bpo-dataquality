package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VPatentsRepresentEntity;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VPatentsRepresentEntityPK;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatentsRepresentRepository extends BaseRepository<VPatentsRepresentEntity, VPatentsRepresentEntityPK> {

    @Query("SELECT c FROM VPatentsRepresentEntity c WHERE c.pk.ptappli.idAppli = :idappli order by c.odagent")
    List<VPatentsRepresentEntity> getRepresentsByIdappli(@Param("idappli") String idappli);

}
