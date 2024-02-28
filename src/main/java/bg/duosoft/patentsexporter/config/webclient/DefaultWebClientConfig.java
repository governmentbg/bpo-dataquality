package bg.duosoft.patentsexporter.config.webclient;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Configuration
public class DefaultWebClientConfig {

    @Bean
    public HttpClient httpClient() {
        return HttpClient.create()
                .responseTimeout(Duration.ofMillis(120000))
                .tcpConfiguration(client ->
                        client
                                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 120000)
                                .doOnConnected(conn -> conn.addHandlerLast(new ReadTimeoutHandler(120000, TimeUnit.MILLISECONDS)).addHandlerLast(new WriteTimeoutHandler(120000, TimeUnit.MILLISECONDS))));
    }

    @Bean
    public WebClient webClient(HttpClient httpClient) {
        return WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .build();
    }


}
