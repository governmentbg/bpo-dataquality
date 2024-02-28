package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.model.CAuthorityFileFilter;

import java.time.LocalDate;
import java.util.List;

public interface AuthorityFileService {
    List<String> selectAuthorityFileRecords(CAuthorityFileFilter filter);
    byte[] generateAuthorityFile(CAuthorityFileFilter filter);
}
