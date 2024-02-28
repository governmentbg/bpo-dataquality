package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CVInvent;
import bg.duosoft.patentsexporter.domain.mapper.VInventMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.InventRepository;
import bg.duosoft.patentsexporter.service.InventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class InventServiceImpl implements InventService {

    private final InventRepository repository;
    private final VInventMapper mapper;

    @Override
    public List<CVInvent> getInventByIdappli(String idappli) {
        return mapper.toCoreList(repository.getInventByIdappli(idappli));
    }

}
