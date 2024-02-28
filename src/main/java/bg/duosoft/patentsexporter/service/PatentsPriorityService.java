package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.CPatentsPriority;

import java.util.List;

public interface PatentsPriorityService {
    List<CPatentsPriority> getPriorityListByIdappli(String idappli);
}
