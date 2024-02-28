package bg.duosoft.patentsexporter.generator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class AuthorityFileGenerator {
    public byte[] generateAuthorityFile(List<String> authorityFileRecords) {
        return getCsvContent(authorityFileRecords).getBytes();
    }

    private static String getCsvContent(List<String> authorityFileRecords) {
        StringBuilder csvContent = new StringBuilder();

        if (!CollectionUtils.isEmpty(authorityFileRecords)) {
            for (String record : authorityFileRecords) {
                csvContent.append(record).append("\n");
            }
        }

        return csvContent.toString();
    }
}
