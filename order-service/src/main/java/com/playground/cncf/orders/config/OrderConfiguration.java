package com.playground.cncf.orders.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class OrderConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "app")
    OrderServiceProperties orderServiceProperties() {
        return new OrderServiceProperties();
    }

    @Bean
    RestClient restClient(){
        return RestClient.create();
    }


}
