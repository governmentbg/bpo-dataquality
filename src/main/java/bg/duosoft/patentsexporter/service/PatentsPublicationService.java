package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.CPatentsPublication;

import java.time.LocalDate;
import java.util.List;

public interface PatentsPublicationService {
    List<CPatentsPublication> getPublicationsByNosectNumberYear(String number, Integer year, Integer nosect);

    LocalDate getFirstDtToPubli(String number, Integer year);

    List<String> getJournals(Integer year);

    List<Integer> getPublicationYears();
}
