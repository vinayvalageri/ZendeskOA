package com.zendesk.vinay.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
//import org.zendesk.client.v2.Zendesk;

@Configuration
public class ZendeskConfig {
    /*@Bean
    public Zendesk getZendesk() {
        Zendesk zd = new Zendesk.Builder("https://usc123.zendesk.com/")
                .setUsername("vinay.1si13cs131@gmail.com")
                .setPassword("amzB@231")
                .build();
        return zd;
    }*/

    @Autowired
    private ConfigProperties properties;
    @Bean
    public WebClient getWebClient() {
        return WebClient.builder()
                .baseUrl(properties.getBaseUrl())
                .defaultHeaders(header -> header.setBasicAuth(properties.getUsername(), properties.getPassword()))
                .build();
        /*return WebClient.builder()
                .baseUrl("https://usc123.zendesk.com/")
                .defaultHeaders(header -> header.setBasicAuth("vinay.1si13cs131@gmail.com", "amzB@231"))
                .build();*/
    }

}
