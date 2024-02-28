package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.CVInvent;
import bg.duosoft.patentsexporter.domain.core.CVOwner;

import java.util.List;

public interface InventService {
    List<CVInvent> getInventByIdappli(String idappli);
}
