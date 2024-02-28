package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.repository.bpo_online.CountryRepository;
import bg.duosoft.patentsexporter.service.CountryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;
//    private final CountryMapper mapper;

    @Override
    public String getEngCountryNameByCode(String idCountry) {
        return repository.getEngCountryNameByCode(idCountry);
    }
}
