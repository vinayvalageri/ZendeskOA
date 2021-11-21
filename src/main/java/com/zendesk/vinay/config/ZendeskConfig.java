package com.zendesk.vinay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zendesk.client.v2.Zendesk;

@Configuration
public class ZendeskConfig {
    @Bean
    public Zendesk getZendesk() {
        Zendesk zd = new Zendesk.Builder("https://usc123.zendesk.com/")
                .setUsername("vinay.1si13cs131@gmail.com")
                .setPassword("amzB@231")
                .build();
        return zd;
    }

}
