package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.CClassin;

import java.util.List;

public interface ClassinService {
    List<CClassin> getClassinListByIdappli(String idappli);
}
