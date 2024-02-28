package bg.duosoft.patentsexporter.config;


import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.ajp.AbstractAjpProtocol;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
@RequiredArgsConstructor
public class AjpConfiguration {

    @Value("${tomcat.ajp.port:#{0}}")
    private int ajpPort;

    @Value("${tomcat.ajp.enabled:#{false}}")
    private boolean tomcatAjpEnabled;

    @Bean
    public ServletWebServerFactory servletContainer() throws UnknownHostException {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        if (tomcatAjpEnabled) {
            Connector ajpConnector = new Connector("AJP/1.3");
            ajpConnector.setPort(ajpPort);
            ajpConnector.setSecure(false);
            ajpConnector.setAllowTrace(false);
            ajpConnector.setScheme("http");
            AbstractAjpProtocol protocolHandler = (AbstractAjpProtocol) ajpConnector.getProtocolHandler();
            protocolHandler.setSecretRequired(false);
            protocolHandler.setAddress(InetAddress.getByName("0.0.0.0"));
            tomcat.addAdditionalTomcatConnectors(ajpConnector);
        }
        return tomcat;
    }
}