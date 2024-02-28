package bg.duosoft.patentsexporter.validator.authority_file;

import bg.duosoft.patentsexporter.domain.core.model.CAuthorityFileFilter;
import bg.duosoft.patentsexporter.validator.config.BaseValidator;
import bg.duosoft.patentsexporter.validator.config.ValidationError;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class AuthorityFileValidator implements BaseValidator<CAuthorityFileFilter> {

    @Override
    public List<ValidationError> validate(CAuthorityFileFilter obj, Object... additionalArgs) {
        List<ValidationError> errors = new ArrayList<>();


        Boolean isAllRecords = obj.getIsAllRecords();
        if (Objects.nonNull(isAllRecords) && !isAllRecords) {
            LocalDate dateFrom = obj.getDateFrom();
            LocalDate dateTo = obj.getDateTo();

            rejectIfTrue(errors, Objects.isNull(dateFrom) && Objects.isNull(dateTo), "authorityFileFilter", "authority.file.partial.empty.period");

            if (Objects.nonNull(dateFrom) && Objects.nonNull(dateTo)) {
                rejectIfFirstDateIsAfterSecond(errors, dateFrom, dateTo, "authorityFileFilter", "authority.file.partial.reversed.period");
            }
        }

        return errors;
    }
}
