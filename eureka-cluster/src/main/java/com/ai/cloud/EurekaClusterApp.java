package com.ai.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by pengqiang on 2017/8/11.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaClusterApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterApp.class, args);
    }
}
