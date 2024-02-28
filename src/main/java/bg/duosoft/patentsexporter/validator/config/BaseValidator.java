package bg.duosoft.patentsexporter.validator.config;

import java.util.List;

public interface BaseValidator<T> extends DefaultValidation {
    List<ValidationError> validate(T obj, Object... additionalArgs);
}
