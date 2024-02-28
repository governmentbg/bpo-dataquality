package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.CVAgent;

import java.util.List;

public interface AgentService {
    List<CVAgent> getAgentsByIdAgent(String idAgent);
}
