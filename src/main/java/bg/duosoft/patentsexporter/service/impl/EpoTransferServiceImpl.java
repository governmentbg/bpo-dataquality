package bg.duosoft.patentsexporter.service.impl;

import bg.duosoft.patentsexporter.client.epo.EpoClient;
import bg.duosoft.patentsexporter.domain.base.CommonMultipartFile;
import bg.duosoft.patentsexporter.domain.core.epo.CFileEpoTransfer;
import bg.duosoft.patentsexporter.domain.core.model.CEpoTransferRequest;
import bg.duosoft.patentsexporter.domain.entity.patent_exporter.FileEpoTransferEntity;
import bg.duosoft.patentsexporter.domain.enums.EpoTransferStatusType;
import bg.duosoft.patentsexporter.domain.mapper.epo.FileEpoTransferMapper;
import bg.duosoft.patentsexporter.repository.patent_exporter.FileEpoTransferRepository;
import bg.duosoft.patentsexporter.service.EpoTransferService;
import com.duosoft.security.UserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import bg.duosoft.patentsexporter.epo.model.PublicationFile;

@Slf4j
@Service
@RequiredArgsConstructor
public class EpoTransferServiceImpl implements EpoTransferService {
    private final EpoClient epoClient;
    private final FileEpoTransferMapper mapper;
    private final FileEpoTransferRepository fileEpoTransferRepository;

    @Override
    public CFileEpoTransfer transferFile(CEpoTransferRequest request) {
        UUID deliveryId = UUID.randomUUID();
        FileEpoTransferEntity epoTransfer;
        try {
            List<PublicationFile> published = transferEpoFile(request, deliveryId, request.getFileName());
            epoTransfer = constructSuccessfulTransferRecord(request, deliveryId.toString(), published);
        } catch (Exception e) {
            log.error("An error occurred while transferring file to EPO of type: !" + request.getDataType().getValue(), e);
            epoTransfer = constructErrorTransferRecord(request, deliveryId.toString(), e.getMessage());
        }

        FileEpoTransferEntity saved = fileEpoTransferRepository.save(epoTransfer);
        return mapper.toCore(saved);
    }

    private List<PublicationFile> transferEpoFile(CEpoTransferRequest request, UUID deliveryId, String fileName) {

        switch (request.getDataType()) {
            case COMBINED_DATA_PACKAGE:
                ResponseEntity<List<PublicationFile>> publishedPackage = epoClient.uploadPublicationFilePackage(deliveryId, request.getDataType().getValue(), new CommonMultipartFile(fileName, fileName, request.getFileContentType(), request.getFileContent()));
                return Objects.nonNull(publishedPackage) ? publishedPackage.getBody() : new ArrayList<>();
            default:
                ResponseEntity<PublicationFile> publishedSingle = epoClient.uploadPublicationFile(deliveryId, request.getDataType().getValue(), new CommonMultipartFile(fileName, fileName, request.getFileContentType(), request.getFileContent()));
                return Objects.nonNull(publishedSingle) && Objects.nonNull(publishedSingle.getBody()) ? List.of(publishedSingle.getBody()) : new ArrayList<>();
        }

    }


    private FileEpoTransferEntity constructTransferRecord(CEpoTransferRequest request, String deliveryId) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        FileEpoTransferEntity transferLogRecord = new FileEpoTransferEntity();
        transferLogRecord.setDataType(request.getDataType().getValue());
        transferLogRecord.setTransferUser(userDetails.getUsername());
        transferLogRecord.setTransferDate(LocalDateTime.now());
        transferLogRecord.setFileName(request.getFileName());
        transferLogRecord.setDeliveryId(deliveryId);
        transferLogRecord.setIsPartial(request.getIsPartial());
        transferLogRecord.setPartialDateFrom(request.getDateFrom());
        transferLogRecord.setPartialDateTo(request.getDateTo());

        return transferLogRecord;
    }

    private FileEpoTransferEntity constructSuccessfulTransferRecord(CEpoTransferRequest request, String deliveryId, List<PublicationFile> publicationFiles) {
        FileEpoTransferEntity fileEpoTransferEntity = constructTransferRecord(request, deliveryId);

        if (!CollectionUtils.isEmpty(publicationFiles)) {
            if (publicationFiles.size() == 1) {
                fillSinglePublicationEpoStatusData(publicationFiles.get(0), fileEpoTransferEntity);
            } else {
                fillMultiplePublicationEpoStatusData(publicationFiles, fileEpoTransferEntity);
            }
        }

        return fileEpoTransferEntity;
    }

    private void fillMultiplePublicationEpoStatusData(List<PublicationFile> publicationFiles, FileEpoTransferEntity fileEpoTransferEntity) {
        StringBuilder epoStatusesBuilder = new StringBuilder();
        StringBuilder epoValidationErrorsBuilder = new StringBuilder();

        for (PublicationFile publicationFile : publicationFiles) {
            String originalFileName = publicationFile.getOriginalFilename();

            epoStatusesBuilder.append(originalFileName).append(":").append(publicationFile.getStatus().name()).append(" ; ").append(System.getProperty("line.separator"));

            if (Objects.nonNull(publicationFile.getValidationError())) {
                epoValidationErrorsBuilder.append(originalFileName).append(":").append(publicationFile.getValidationError().toString()).append(" ; ").append(System.getProperty("line.separator"));
            }
        }

        String epoStatuses = epoStatusesBuilder.toString();
        if (StringUtils.hasText(epoStatuses)) {
            fileEpoTransferEntity.setEpoStatus(epoStatuses);
        }

        String epoValidationErrors = epoValidationErrorsBuilder.toString();
        if (StringUtils.hasText(epoValidationErrors)) {
            fileEpoTransferEntity.setEpoValidationErrors(epoValidationErrors);
        }
    }

    private void fillSinglePublicationEpoStatusData(PublicationFile publicationFile, FileEpoTransferEntity fileEpoTransferEntity) {
        fileEpoTransferEntity.setEpoStatus(publicationFile.getStatus().name());

        if (Objects.nonNull(publicationFile.getValidationError())) {
            fileEpoTransferEntity.setEpoValidationErrors(publicationFile.getValidationError().toString());
        }
    }

    private FileEpoTransferEntity constructErrorTransferRecord(CEpoTransferRequest request, String deliveryId, String errorMessage) {
        FileEpoTransferEntity fileEpoTransferEntity = constructTransferRecord(request, deliveryId);

        fileEpoTransferEntity.setEpoStatus(EpoTransferStatusType.ERROR.name());
        fileEpoTransferEntity.setErrorMessage(errorMessage);
        return fileEpoTransferEntity;
    }

}
