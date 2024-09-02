package com.wangguangwu.nacosfeignconsumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangguangwu
 */
@SpringBootApplication
@EnableFeignClients
public class NacosFeignConsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFeignConsumerServiceApplication.class, args);
    }

}
