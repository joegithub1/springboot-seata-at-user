package com.joe.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SeataUserApplication
 * @Description:
 * @Author huangjian
 * @Date 2023/7/23
 **/
@EnableDiscoveryClient
@EnableDubbo
@SpringBootApplication
public class SeataUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataUserApplication.class);
    }
}
