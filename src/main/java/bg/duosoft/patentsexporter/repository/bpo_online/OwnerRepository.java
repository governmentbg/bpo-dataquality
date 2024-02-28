package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.VOwnerEntity;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OwnerRepository extends BaseRepository<VOwnerEntity, Integer> {

    @Query("SELECT c FROM VOwnerEntity c WHERE c.idowner = :idInvent")
    List<VOwnerEntity> getOwnerByIdInvent(@Param("idInvent") Integer idInvent);

}
