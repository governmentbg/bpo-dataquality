package bg.duosoft.patentsexporter.config.epo;

import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

@Slf4j
@Component
@RequiredArgsConstructor
public class EpoFeignClientConfig {
    private final ConfidentialClientApplication confidentialClientApplication;
    private final ClientCredentialParameters clientCredentialParameters;

    @Bean
    public RequestInterceptor bearerAuthRequestInterceptor() {

        return requestTemplate -> {
            try {
                IAuthenticationResult authenticationResult = confidentialClientApplication.acquireToken(clientCredentialParameters).get();
                requestTemplate.header("Authorization", "Bearer " + authenticationResult.accessToken());
            } catch (InterruptedException | ExecutionException e) {
                log.error("Cannot extract epo authentication result !");
                throw new RuntimeException(e);
            }
        };
    }
}
