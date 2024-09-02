package com.wangguangwu.nacoscustomstrategyconsumerservice.controller;


import com.wangguangwu.nacoscustomstrategyconsumerservice.constant.HttpProtocolConstants;
import com.wangguangwu.nacoscustomstrategyconsumerservice.constant.ServiceConstants;
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

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/callService")
    public String callService() {
        return restTemplate.getForObject(HttpProtocolConstants.HTTP_PROTOCOL + ServiceConstants.SERVICE_NAME + "/api/callServiceWait", String.class);
    }
}
