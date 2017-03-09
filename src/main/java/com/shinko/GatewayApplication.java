package com.shinko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
@EnableZuulProxy
@Configuration
@ComponentScan
public class GatewayApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
