package bg.duosoft.patentsexporter.controller;

import bg.duosoft.patentsexporter.domain.core.epo.CFileEpoTransfer;
import bg.duosoft.patentsexporter.domain.core.model.CEpoTransferRequest;
import bg.duosoft.patentsexporter.domain.core.model.CAuthorityFileFilter;
import bg.duosoft.patentsexporter.epo.model.PublicationFile;
import bg.duosoft.patentsexporter.service.AuthorityFileService;
import bg.duosoft.patentsexporter.service.EpoTransferService;
import bg.duosoft.patentsexporter.util.authority_file.AuthorityFileNameUtils;
import bg.duosoft.patentsexporter.validator.authority_file.AuthorityFileEpoTransferValidator;
import bg.duosoft.patentsexporter.validator.authority_file.AuthorityFileValidator;
import bg.duosoft.patentsexporter.validator.config.ValidationError;
import com.duosoft.security.UserDetails;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Base64;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/authority-files")
@AllArgsConstructor
public class AuthorityFileController {

    private final String authorityFileView = "authority_file_page";

    private final AuthorityFileService authorityFileService;
    private final AuthorityFileValidator authorityFileValidator;
    private final AuthorityFileEpoTransferValidator authorityFileEpoTransferValidator;
    private final EpoTransferService epoTransferService;

    @GetMapping
    public String viewAuthorityFilesPage(Model model) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("username", userDetails.getUsername().toUpperCase());
        return authorityFileView;
    }

    @PostMapping("/generate")
    public String generateFile(@RequestBody CAuthorityFileFilter filter, Model model) {
        List<ValidationError> errors = authorityFileValidator.validate(filter);

        if (CollectionUtils.isEmpty(errors)) {
            byte[] bytes = authorityFileService.generateAuthorityFile(filter);
            model.addAttribute("fileName", AuthorityFileNameUtils.getAuthorityFileName(filter));
            model.addAttribute("fileContent", Base64.getEncoder().encodeToString(bytes));

            Boolean isAllRecords = filter.getIsAllRecords();
            model.addAttribute("isPartial", !isAllRecords);
            if (!isAllRecords) {
                model.addAttribute("partialDateFrom", filter.getDateFrom());
                model.addAttribute("partialDateTo", filter.getDateTo());
            }
            return "fragments/authority_file/authority_file_fragments :: generated-file-fields";
        } else {
            model.addAttribute("validationErrors", errors);
            return "fragments/validation_errors::errors";
        }
    }

    @PostMapping(value = "/download")
    public void downloadAuthorityFile(@RequestParam String fileName, @RequestParam("fileContent") String base64FileContent, HttpServletResponse response) {
        log.info("Download authority file ...");
        log.info("Decode authority file ...");
        byte[] fileContent = Base64.getDecoder().decode(base64FileContent);
        log.info("Authority file decoded successfully ...");

        try {
            response.setContentType("text/csv");
            response.setHeader("Content-Disposition", "attachment; filename*=UTF-8''" + fileName);
            response.getOutputStream().write(fileContent);
            response.flushBuffer();
            log.info("Finished writing file content response ...");
        } catch (IOException ex) {
            log.error("Problem reading attachments", ex);
        }
    }

    @PostMapping("/epo-tranfer")
    public String epoTransfer(@RequestParam String fileName,
                              @RequestParam("fileContent") String base64FileContent,
                              @RequestParam Boolean isPartial,
                              @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate partialDateFrom,
                              @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate partialDateTo,
                              Model model) {
        byte[] fileContent = Base64.getDecoder().decode(base64FileContent);
        CEpoTransferRequest request = constructEpoTransferObject(fileName, isPartial, partialDateFrom, partialDateTo, fileContent);
        List<ValidationError> errors = authorityFileEpoTransferValidator.validate(request);

        if (CollectionUtils.isEmpty(errors)) {
            CFileEpoTransfer fileEpoTransfer = epoTransferService.transferFile(request);
            model.addAttribute("fileEpoTransfer", fileEpoTransfer);
            return "fragments/epo_transfer_message::epo-transfer-message";
        } else {
            model.addAttribute("validationErrors", errors);
            return "fragments/validation_errors::errors";
        }
    }

    private CEpoTransferRequest constructEpoTransferObject(String fileName, Boolean isPartial, LocalDate dateFrom, LocalDate dateTo, byte[] fileContent) {
        return CEpoTransferRequest
                .builder()
                .fileName(fileName)
                .fileContent(fileContent)
                .isPartial(isPartial)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .dataType(PublicationFile.DataTypeEnum.AUTHORITY_FILE)
                .fileContentType("text/csv")
                .build();
    }
}
