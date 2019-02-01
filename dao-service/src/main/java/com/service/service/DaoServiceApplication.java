package com.service.service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DaoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaoServiceApplication.class, args);
    }
}
