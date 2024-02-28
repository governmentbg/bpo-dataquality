package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CVAgent;
import bg.duosoft.patentsexporter.domain.mapper.VAgentMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.AgentRepository;
import bg.duosoft.patentsexporter.service.AgentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AgentServiceImpl implements AgentService {

    private final AgentRepository repository;
    private final VAgentMapper mapper;

    @Override
    public List<CVAgent> getAgentsByIdAgent(String idAgent) {
        return mapper.toCoreList(repository.getAgentsByIdAgent(idAgent));
    }
}
