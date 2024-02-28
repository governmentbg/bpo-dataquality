package bg.duosoft.patentsexporter.controller;

import bg.duosoft.patentsexporter.domain.core.epo.CFileEpoTransfer;
import bg.duosoft.patentsexporter.domain.core.model.CEpoTransferRequest;
import bg.duosoft.patentsexporter.generator.PublicationFileGenerator;
import bg.duosoft.patentsexporter.service.EpoTransferService;
import bg.duosoft.patentsexporter.service.PatentsPublicationService;
import bg.duosoft.patentsexporter.validator.config.ValidationError;
import com.duosoft.security.UserDetails;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Objects;

@Slf4j
@Controller
@RequestMapping("/patents-publication")
@AllArgsConstructor
public class PatentsPublicationController {
    private final PatentsPublicationService patentsPublicationService;
    private final PublicationFileGenerator publicationFileGenerator;
    private final EpoTransferService epoTransferService;

    @RequestMapping(method = RequestMethod.GET)
    public String viewHome(Model model, HttpServletRequest request) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("username", userDetails.getUsername().toUpperCase());
        List<Integer> publicationYears = patentsPublicationService.getPublicationYears();
        model.addAttribute("yearList", publicationYears);
        model.addAttribute("numberList", patentsPublicationService.getJournals(publicationYears.get(0)));
        return "patent_publication_page";
    }

    @PostMapping("/loadNumbersList")
    public String searchDiary(
            @RequestParam Integer year, Model model) {
        model.addAttribute("numberList", patentsPublicationService.getJournals(year));
        return "fragments/number-field::number-field";
    }

    @PostMapping("/generate")
    @ResponseBody
    public String generate(
            @RequestParam String number, @RequestParam Integer year) {
        try {
            return publicationFileGenerator.generatePublicationFile(number, year);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @RequestMapping(value = "/download")
    public void downloadFile(@RequestParam(value = "path") String path, HttpServletResponse response) {
        try {
            File file = new File(path);
            response.setContentType("application/zip");
            response.setHeader("Content-Disposition", "attachment; filename*=UTF-8''" + file.getName());
            response.getOutputStream().write(Files.readAllBytes(file.toPath()));
            response.flushBuffer();
        } catch (IOException ex) {
            log.error("Problem reading attachments", ex);
        }
    }

    @PostMapping("/epo-transfer")
    public String epoTransfer(@RequestParam(value = "path") String path, Model model) {
        File file = new File(path);
        byte[] content = readFile(file);

        if (Objects.nonNull(content)) {
            CFileEpoTransfer fileEpoTransfer = epoTransferService.transferFile(constructEpoRequest(file, content));
            model.addAttribute("fileEpoTransfer", fileEpoTransfer);
            return "fragments/epo_transfer_message::epo-transfer-message";
        } else {
            model.addAttribute("validationErrors", List.of(new ValidationError("patentsEpoTransfer", "epo.transfer.patents.file.read.error", null, null)));
            return "fragments/validation_errors::errors";
        }
    }

    private static CEpoTransferRequest constructEpoRequest(File file, byte[] content) {
        return CEpoTransferRequest.builder()
                .fileName(file.getName())
                .fileContent(content)
                .fileContentType("application/octet-stream")
                .dataType(bg.duosoft.patentsexporter.epo.model.PublicationFile.DataTypeEnum.COMBINED_DATA_PACKAGE)
                .isPartial(false)
                .build();
    }

    private static byte[] readFile(File file) {
        byte[] content;

        try {
            content = Files.readAllBytes(file.toPath());
        } catch (IOException ex) {
            log.error("Problem reading attachments", ex);
            content = null;
        }

        return content;
    }
}
