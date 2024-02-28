package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VInventEntity;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.VInventEntityPK;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InventRepository extends BaseRepository<VInventEntity, VInventEntityPK> {

    @Query("SELECT c FROM VInventEntity c WHERE c.pk.ptappli.idAppli = :idappli ORDER BY c.ordinvent")
    List<VInventEntity> getInventByIdappli(@Param("idappli") String idappli);

}
