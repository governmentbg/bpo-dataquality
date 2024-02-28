package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CPatentsPriority;
import bg.duosoft.patentsexporter.domain.mapper.PatentsPriorityMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.PatentsPriorityRepository;
import bg.duosoft.patentsexporter.service.PatentsPriorityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PatentsPriorityServiceImpl implements PatentsPriorityService {

    private final PatentsPriorityRepository repository;
    private final PatentsPriorityMapper mapper;

    @Override
    public List<CPatentsPriority> getPriorityListByIdappli(String idappli) {
        return mapper.toCoreList(repository.getPriorityListByIdappli(idappli));
    }
}
