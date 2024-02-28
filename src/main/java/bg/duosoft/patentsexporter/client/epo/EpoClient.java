package bg.duosoft.patentsexporter.client.epo;

import bg.duosoft.patentsexporter.config.epo.ClientConfiguration;
import bg.duosoft.patentsexporter.epo.api.ApiApi;
import bg.duosoft.patentsexporter.epo.model.PublicationFile;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "${api.name:api}", url = "${epo.feign.baseUrl}", configuration = ClientConfiguration.class)
public interface EpoClient extends ApiApi {


    @RequestMapping(
            method = RequestMethod.POST,
            value = "/api/publicationFile/single",
            produces = "*/*",
            consumes = "multipart/form-data"
    )
    ResponseEntity<PublicationFile> uploadPublicationFile(@RequestParam(value = "deliveryId") UUID deliveryId,
                                                          @RequestParam(value = "dataType") String dataType,
                                                          @RequestPart(value = "file") MultipartFile file);

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/api/publicationFile/package",
            produces = "*/*",
            consumes = "multipart/form-data"
    )
    ResponseEntity<List<PublicationFile>> uploadPublicationFilePackage(
          @RequestParam(value = "deliveryId") UUID deliveryId,
          @RequestParam(value = "dataType", required = false, defaultValue = "COMBINED_DATA_PACKAGE") String dataType,
          @RequestPart(value = "file") MultipartFile file
    );
}
