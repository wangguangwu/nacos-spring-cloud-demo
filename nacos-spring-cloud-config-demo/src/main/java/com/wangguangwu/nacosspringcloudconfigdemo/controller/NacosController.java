package com.wangguangwu.nacosspringcloudconfigdemo.controller;

import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wangguangwu
 */
@RestController
@RequestMapping("/nacos")
@RefreshScope
public class NacosController {

    private static final Logger LOG = LoggerFactory.getLogger(NacosController.class);

    @Resource
    private ConfigurableApplicationContext context;

    @Value("${author.name}")
    private String nacosAuthorName;

    @GetMapping("/test")
    public String nacosTest(){
        String authorName = context.getEnvironment().getProperty("author.name");
        LOG.info("获取到的作者姓名为：{}", authorName);
        return authorName;
    }

    @GetMapping("/name")
    public String nacosName(){
        LOG.info("从Nacos中获取到的作者的姓名为：{}", nacosAuthorName);
        return nacosAuthorName;
    }
}
