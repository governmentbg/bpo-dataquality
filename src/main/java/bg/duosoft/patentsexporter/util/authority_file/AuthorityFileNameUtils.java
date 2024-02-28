package bg.duosoft.patentsexporter.util.authority_file;

import bg.duosoft.patentsexporter.domain.core.model.CAuthorityFileFilter;
import bg.duosoft.patentsexporter.util.DateUtils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class AuthorityFileNameUtils {
    private static final String AUTHORITY_FILE_PREFIX = "BG_AF";
    private static final String AUTHORITY_FILE_FULL_PREFIX = "FULL";
    private static final String AUTHORITY_FILE_PARTIAL_PREFIX = "PARTIAL";
    private static final String AUTHORITY_FILE_SEPARATOR = "_";

    public static String getAuthorityFileName(CAuthorityFileFilter filter) {
        StringBuilder stringBuilder = new StringBuilder(AUTHORITY_FILE_PREFIX + AUTHORITY_FILE_SEPARATOR).append(DateUtils.formatDate(new Date(),DateUtils.DATE_FORMATTER_SIMPLE)).append(".csv");

// TODO - should I have indication if the file is partial?
//        Boolean isAllRecords = filter.getIsAllRecords();
//        if (Objects.nonNull(isAllRecords) && isAllRecords) {
//            stringBuilder.append(AUTHORITY_FILE_FULL_PREFIX);
//        } else {
//            stringBuilder.append(AUTHORITY_FILE_PARTIAL_PREFIX);
//        }

        return stringBuilder.toString();
    }
}
