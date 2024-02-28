package bg.duosoft.patentsexporter.service;

import bg.duosoft.patentsexporter.domain.core.epo.CFileEpoTransfer;
import bg.duosoft.patentsexporter.domain.core.model.CEpoTransferRequest;

public interface EpoTransferService {
     CFileEpoTransfer transferFile(CEpoTransferRequest request);
}
