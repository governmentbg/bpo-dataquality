package bg.duosoft.patentsexporter.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyAccess {

    @Value("${files.path}")
    private String filesPath;

    public String getFilesPath() {
        return filesPath;
    }
}
