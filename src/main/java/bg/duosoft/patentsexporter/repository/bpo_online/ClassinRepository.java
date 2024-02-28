package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.ClassinEntity;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.ClassinEntityPK;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassinRepository extends BaseRepository<ClassinEntity, ClassinEntityPK> {

    @Query("SELECT c FROM ClassinEntity c WHERE c.pk.ptAppli.idAppli = :idappli ORDER BY c.pk.odClass")
    List<ClassinEntity> getClassinListByIdappli(@Param("idappli") String idappli);

}
