package com.example.cloudfeign.controller;

import com.example.cloudfeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能:
 * 创建日期:2018/10/15-17:55
 * 创建人:薛陈
 */
@RestController
public class HelloController {
    @Autowired
    SchedualServiceHi helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.sayHi(name);
    }
}
