package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.CVPatentsRepresent;

import java.util.List;

public interface PatentsRepresentService {
    List<CVPatentsRepresent> getRepresentByIdappli(String idappli);
}
