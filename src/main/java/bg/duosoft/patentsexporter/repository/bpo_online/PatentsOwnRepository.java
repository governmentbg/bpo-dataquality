package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VPatentsOwnEntity;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VPatentsOwnEntityPK;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatentsOwnRepository extends BaseRepository<VPatentsOwnEntity, VPatentsOwnEntityPK> {

    @Query("SELECT c FROM VPatentsOwnEntity c WHERE c.pk.ptappli.idAppli = :idappli")
    List<VPatentsOwnEntity> getOwnByIdppli(@Param("idappli") String idappli);

}
