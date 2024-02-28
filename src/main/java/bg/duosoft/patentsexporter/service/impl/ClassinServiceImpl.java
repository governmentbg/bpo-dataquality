package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CClassin;
import bg.duosoft.patentsexporter.domain.entity.bpo_online.patents.ClassinEntity;
import bg.duosoft.patentsexporter.domain.mapper.ClassinMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.ClassinRepository;
import bg.duosoft.patentsexporter.service.ClassinService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClassinServiceImpl implements ClassinService {

    private final ClassinRepository repository;
    private final ClassinMapper mapper;


    @Override
    public List<CClassin> getClassinListByIdappli(String idappli) {
        List<ClassinEntity> classinListByIdappli = repository.getClassinListByIdappli(idappli);
        return mapper.toCoreList(classinListByIdappli);
    }
}
