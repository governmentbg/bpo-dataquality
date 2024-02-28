package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CPct;
import bg.duosoft.patentsexporter.domain.mapper.PctMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.PctRepository;
import bg.duosoft.patentsexporter.service.PctService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PctServiceImpl implements PctService {

    private final PctRepository repository;
    private final PctMapper mapper;

    @Override
    public CPct getPctByIdappli(String idappli) {
        return mapper.toCore(repository.getPctByIdappli(idappli));
    }
}
