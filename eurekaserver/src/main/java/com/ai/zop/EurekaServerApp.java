package com.ai.zop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by pengqiang on 2017/8/11.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApp.class)
                .web(true).run(args);
    }
}
