package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.CVPatentsOwn;

import java.util.List;

public interface PatentsOwnService {
    List<CVPatentsOwn> getOwnByIdappli(String idappli);
}
