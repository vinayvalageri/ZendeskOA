package com.zendesk.vinay.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ZendeskConfig {

    @Autowired
    private ConfigProperties properties;

    /**
     * Webclient configuration for communicating with zendesk API.
     * Using Oauth token as authorization
     */
    @Bean
    public WebClient getWebClient() {
        return WebClient.builder()
                .baseUrl(properties.getBaseUrl())
                .defaultHeaders(header -> header.setBearerAuth(properties.getoAuthToken()))
                .build();
    }

}
