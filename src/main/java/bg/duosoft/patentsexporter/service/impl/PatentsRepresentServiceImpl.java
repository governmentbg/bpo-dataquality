package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CVPatentsRepresent;
import bg.duosoft.patentsexporter.domain.mapper.VPatentsRepresentMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.PatentsRepresentRepository;
import bg.duosoft.patentsexporter.service.PatentsRepresentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PatentsRepresentServiceImpl implements PatentsRepresentService {

    private final PatentsRepresentRepository repository;
    private final VPatentsRepresentMapper mapper;

    @Override
    public List<CVPatentsRepresent> getRepresentByIdappli(String idappli) {
        return mapper.toCoreList(repository.getRepresentsByIdappli(idappli));
    }
}
