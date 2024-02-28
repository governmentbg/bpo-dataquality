package bg.duosoft.patentsexporter.repository.bpo_online.custom;

import bg.duosoft.patentsexporter.domain.core.model.CAuthorityFileFilter;

import java.util.List;

public interface PatentsPublicationRepositoryCustom {
    List<String> selectAuthorityFileRecords(CAuthorityFileFilter filter);
}
