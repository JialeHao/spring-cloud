package com.haojiale.eurekaproducernginx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author haojiale
 * @Date 2019/01/08 10:35
 * @Version 1.0
 **/

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return "hello "+name+",this is producer two send first message";
    }
}
