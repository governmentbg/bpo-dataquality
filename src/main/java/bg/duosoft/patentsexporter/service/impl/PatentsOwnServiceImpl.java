package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CVPatentsOwn;
import bg.duosoft.patentsexporter.domain.mapper.VPatentsOwnMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.PatentsOwnRepository;
import bg.duosoft.patentsexporter.service.PatentsOwnService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PatentsOwnServiceImpl implements PatentsOwnService {

    private final PatentsOwnRepository repository;
    private final VPatentsOwnMapper mapper;

    @Override
    public List<CVPatentsOwn> getOwnByIdappli(String idappli) {
        return mapper.toCoreList(repository.getOwnByIdppli(idappli));
    }
}
