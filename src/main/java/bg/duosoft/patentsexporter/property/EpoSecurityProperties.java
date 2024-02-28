package bg.duosoft.patentsexporter.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("epo.security")
public class EpoSecurityProperties {
    private String authority;
    private String clientId;
    private String keyPath;
    private String certPath;
    private String scope;
}
