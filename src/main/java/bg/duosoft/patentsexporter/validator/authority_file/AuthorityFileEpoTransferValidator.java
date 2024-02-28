package bg.duosoft.patentsexporter.validator.authority_file;

import bg.duosoft.patentsexporter.domain.core.model.CEpoTransferRequest;
import bg.duosoft.patentsexporter.validator.config.BaseValidator;
import bg.duosoft.patentsexporter.validator.config.ValidationError;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class AuthorityFileEpoTransferValidator implements BaseValidator<CEpoTransferRequest> {

    @Override
    public List<ValidationError> validate(CEpoTransferRequest epoTransferRequest, Object... additionalArgs) {
        List<ValidationError> errors = new ArrayList<>();

        if (Objects.nonNull(epoTransferRequest)) {
            byte[] fileContent = epoTransferRequest.getFileContent();
            rejectIfTrue(errors, Objects.isNull(fileContent) || fileContent.length == 0, "authorityFileTransfer", "authority.file.partial.empty.file");
        }

        return errors;
    }
}
