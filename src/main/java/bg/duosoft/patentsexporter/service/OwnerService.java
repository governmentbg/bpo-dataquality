package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.CVOwner;

import java.util.List;

public interface OwnerService {
    List<CVOwner> getOwnerByIdInvent(Integer idInvent);
}
