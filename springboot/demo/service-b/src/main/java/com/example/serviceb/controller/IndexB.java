package com.example.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

@RestController
// 添加注解声明是注册中心客户端
@EnableDiscoveryClient
// 实现不同子服务调用
@EnableFeignClients
public class IndexB {
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @RequestMapping("call1")
    public String call1() {
        String result = serviceAFeignClient.IndexA1();
        return "b to a 访问结果 ---" + result;
    }

    /**
     * 微服务之间GET传参数
     * 双方 @RequestParam("id") 必须指定相同的value值。只要不对应都会报错。
     * @param id ""
     * @return ""
     */
    @RequestMapping("call2")
    public String call2(@RequestParam("id") String id) {
        String result = serviceAFeignClient.IndexA2(id);
        return "b to a 访问结果 ---" + result;
    }

    /**
     * 微服务之间POST传参数
     * @param title ""
     * @param id ""
     * @return ""
     */
    @PostMapping("call3")
    public String call3(@RequestParam("title") String title, @RequestParam("id") Integer id) {
        String result = serviceAFeignClient.IndexA3(title, id);
        return "b to a 访问结果 ---" + result;
    }

    @PostMapping(value = "call4")
    public String call4(@RequestBody String body) {
        String result = serviceAFeignClient.IndexA4(body);
        return "b to a 访问结果 ---" + result;
    }
}
