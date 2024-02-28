package bg.duosoft.patentsexporter.repository.bpo_online;

import bg.duosoft.patentsexporter.domain.entity.bpo_online.public_.VAgentEntity;
import bg.duosoft.patentsexporter.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AgentRepository extends BaseRepository<VAgentEntity, String> {

    @Query("SELECT c FROM VAgentEntity c WHERE c.idagent = :idAgent")
    List<VAgentEntity> getAgentsByIdAgent(@Param("idAgent") String idAgent);

}
