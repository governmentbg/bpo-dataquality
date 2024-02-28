package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CAbstract;
import bg.duosoft.patentsexporter.domain.mapper.AbstractMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.AbstractRepository;
import bg.duosoft.patentsexporter.service.AbstractService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AbstractServiceImpl implements AbstractService {

    private final AbstractRepository repository;
    private final AbstractMapper mapper;

    @Override
    public CAbstract getAbstractByIdappli(String idappli) {
        return mapper.toCore(repository.findById(idappli).orElse(null));
    }
}
