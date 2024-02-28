package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.CPatentsPublication;
import bg.duosoft.patentsexporter.domain.mapper.PatentsPublicationMapper;
import bg.duosoft.patentsexporter.repository.bpo_online.PatentsPublicationRepository;
import bg.duosoft.patentsexporter.service.PatentsPublicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PatentsPublicationServiceImpl implements PatentsPublicationService {

    private final PatentsPublicationRepository repository;
    private final PatentsPublicationMapper mapper;

    @Override
    public List<CPatentsPublication> getPublicationsByNosectNumberYear(String number, Integer year, Integer nosect) {
        return mapper.toCoreList(repository.getPublicationsByNosectNumberYear(number, year, nosect));
    }

    @Override
    public LocalDate getFirstDtToPubli(String number, Integer year) {
        return repository.getFirstDtToPubli(number, year).get(0);
    }

    @Override
    public List<String> getJournals(Integer year) {
        return repository.getJournals(year);
    }

    @Override
    public List<Integer> getPublicationYears() {
        return repository.getPublicationYears();
    }
}
