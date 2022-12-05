package com.example.servicea.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 添加注解声明是注册中心客户端
@EnableDiscoveryClient
// 实现不同子服务调用
@EnableFeignClients
public class IndexA {
    @RequestMapping("testA1")
    public String test1(){
        return "Hello A1";
    }

    /**
     * 微服务GET接收传参实例
     * @param id ""
     * @return ""
     */
    @RequestMapping("testA2")
    public String test2(@RequestParam("id") String id){
        return "Hello A2 "+ id;
    }
    /**
     * 微服务POST接收传参实例
     * @param title ""
     * @param id ""
     * @return ""
     */
    @PostMapping(value = "testA3")
    public String test3(@RequestParam("title") String title, @RequestParam("id") Integer id) {
        return "Hello A3 "+ title + " " + id;
    }
}
