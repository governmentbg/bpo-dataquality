package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.domain.core.model.CAuthorityFileFilter;
import bg.duosoft.patentsexporter.generator.AuthorityFileGenerator;
import bg.duosoft.patentsexporter.repository.bpo_online.PatentsPublicationRepository;
import bg.duosoft.patentsexporter.service.AuthorityFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorityFileServiceImpl implements AuthorityFileService {

    private final PatentsPublicationRepository patentsPublicationRepository;
    private final AuthorityFileGenerator authorityFileGenerator;

    @Override
    public List<String> selectAuthorityFileRecords(CAuthorityFileFilter filter) {
        return patentsPublicationRepository.selectAuthorityFileRecords(filter);
    }

    @Override
    public byte[] generateAuthorityFile(CAuthorityFileFilter filter) {
        List<String> authorityFileRecords = selectAuthorityFileRecords(filter);
        return authorityFileGenerator.generateAuthorityFile(authorityFileRecords);
    }
}
