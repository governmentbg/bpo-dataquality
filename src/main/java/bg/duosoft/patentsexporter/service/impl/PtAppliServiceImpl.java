package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CPtAppli;
import bg.duosoft.patentsexporter.domain.mapper.PtAppliMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.PtAppliRepository;
import bg.duosoft.patentsexporter.service.PtAppliService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PtAppliServiceImpl implements PtAppliService {

    private final PtAppliRepository repository;
    private final PtAppliMapper mapper;


    @Override
    public CPtAppli getPtappliByIdappli(String idappli) {
        return mapper.toCore(repository.findById(idappli).orElse(null));
    }
}
