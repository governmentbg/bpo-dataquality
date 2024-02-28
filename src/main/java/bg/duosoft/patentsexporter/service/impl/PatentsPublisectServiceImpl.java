package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.repository.bpo_online.PatentsPublisectRepository;
import bg.duosoft.patentsexporter.service.PatentsPublisectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PatentsPublisectServiceImpl implements PatentsPublisectService {

    private final PatentsPublisectRepository repository;
//    private final PatentsPublisectMapper mapper;

    @Override
    public String getPublCodeByNosect(Integer nosect) {
        return repository.getPublCodeByNosect(nosect);
    }
}
