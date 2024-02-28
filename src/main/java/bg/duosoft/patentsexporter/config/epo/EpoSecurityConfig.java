package bg.duosoft.patentsexporter.config.epo;

import bg.duosoft.patentsexporter.property.EpoSecurityProperties;
import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import lombok.RequiredArgsConstructor;
import org.bouncycastle.util.io.pem.PemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collections;

@Configuration
@RequiredArgsConstructor
public class EpoSecurityConfig {

    private final EpoSecurityProperties properties;

    @Bean
    public ConfidentialClientApplication confidentialClientApplication() throws Exception {
        PemReader pemReader = new PemReader(new InputStreamReader(new FileInputStream(properties.getKeyPath())));
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(pemReader.readPemObject().getContent());
        PrivateKey key = KeyFactory.getInstance("RSA").generatePrivate(spec);

        InputStream certStream = new ByteArrayInputStream(Files.readAllBytes(Paths.get(properties.getCertPath())));
        X509Certificate cert = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(certStream);

        return ConfidentialClientApplication.builder(
                        properties.getClientId(),
                        ClientCredentialFactory.createFromCertificate(key, cert))
                .authority(properties.getAuthority())
                .build();
    }

    @Bean
    public ClientCredentialParameters clientCredentialParameters() {
        return ClientCredentialParameters.builder(
                        Collections.singleton(properties.getScope()))
                .build();
    }
}
