package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.PctEntity;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PctRepository extends BaseRepository<PctEntity, String> {
    @Query("SELECT c FROM PctEntity c WHERE c.idappli = :idappli order by c.pctApplicationDate")
    PctEntity getPctByIdappli(@Param("idappli") String idappli);
}
