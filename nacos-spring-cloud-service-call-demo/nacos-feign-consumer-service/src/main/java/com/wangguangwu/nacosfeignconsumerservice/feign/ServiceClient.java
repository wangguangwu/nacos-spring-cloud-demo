package com.wangguangwu.nacosfeignconsumerservice.feign;

import com.wangguangwu.nacosfeignconsumerservice.feign.fallback.ServiceClientFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangguangwu
 */
@FeignClient(name = "nacos-provider-service", fallbackFactory = ServiceClientFallBackFactory.class)
public interface ServiceClient {

    @GetMapping("/api/callService")
    String callService();

    @GetMapping("/api/callException")
    void callException();

}
