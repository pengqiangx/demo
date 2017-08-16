package com.ai.zop.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by pengqiang on 2017/8/11.
 */

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.ai.zop")
public class EurekaClientApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                EurekaClientApp.class)
                .web(true).run(args);
    }
}
