package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CVOwner;
import bg.duosoft.patentsexporter.domain.mapper.VOwnerMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.OwnerRepository;
import bg.duosoft.patentsexporter.service.OwnerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository repository;
    private final VOwnerMapper mapper;

    @Override
    public List<CVOwner> getOwnerByIdInvent(Integer idInvent) { //getOwnerByIdowner
        return mapper.toCoreList(repository.getOwnerByIdInvent(idInvent));
    }
}
