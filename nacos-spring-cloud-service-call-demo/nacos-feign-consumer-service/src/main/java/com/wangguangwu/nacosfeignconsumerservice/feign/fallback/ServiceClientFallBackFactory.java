package com.wangguangwu.nacosfeignconsumerservice.feign.fallback;

import com.wangguangwu.nacosfeignconsumerservice.feign.ServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 回退逻辑
 *
 * @author wangguangwu
 */
@Component
@Slf4j
public class ServiceClientFallBackFactory implements FallbackFactory<ServiceClient> {

    @Override
    public ServiceClient create(Throwable cause) {
        return new ServiceClient() {
            @Override
            public String callService() {
                log.error("服务调用异常: {}", cause.getMessage(), cause);
                return "服务调用失败";
            }

            @Override
            public void callException() {
                log.error("服务调用异常: {}", cause.getMessage(), cause);
            }
        };
    }
}
