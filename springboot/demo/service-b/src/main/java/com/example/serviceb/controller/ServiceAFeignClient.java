package com.example.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("SERVICE-OBJECT-A")
public interface ServiceAFeignClient {
    @RequestMapping("testA1")
    String IndexA1();

    @RequestMapping("testA2")
    String IndexA2(@RequestParam("id") String id);

    @PostMapping("testA3")
    String IndexA3(@RequestParam("title") String title, @RequestParam("id") Integer id);
}
