package com.zendesk.vinay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@ConfigurationPropertiesScan("com.zendesk.vinay")
public class VinayApplication {

    public static void main(String[] args) {
        SpringApplication.run(VinayApplication.class, args);
    }

}
