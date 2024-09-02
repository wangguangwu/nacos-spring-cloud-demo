package com.wangguangwu.nacosrestconsumerservice.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author wangguangwu
 */
@RestController
@RequestMapping("api")
public class ApiController {

    private static final String SERVICE_NAME = "http://nacos-provider-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/callService")
    public String callService() {
        return restTemplate.getForObject(SERVICE_NAME + "/api/callService", String.class);
    }
}
