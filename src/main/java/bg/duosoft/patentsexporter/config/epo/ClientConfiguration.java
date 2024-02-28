package bg.duosoft.patentsexporter.config.epo;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "bg.duosoft.patentsexporter.client.epo", defaultConfiguration = EpoFeignClientConfig.class)
public class ClientConfiguration {
}
