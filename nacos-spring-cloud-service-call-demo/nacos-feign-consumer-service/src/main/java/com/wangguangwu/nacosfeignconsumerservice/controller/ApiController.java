package com.wangguangwu.nacosfeignconsumerservice.controller;

import com.wangguangwu.nacosfeignconsumerservice.feign.ServiceClient;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangguangwu
 */
@RestController
@RequestMapping("api")
public class ApiController {

    @Resource
    private ServiceClient serviceClient;

    @GetMapping("/callService")
    public String callService() {
        return serviceClient.callService();
    }

    @GetMapping("/callException")
    public void callException() {
        serviceClient.callException();
    }
}
