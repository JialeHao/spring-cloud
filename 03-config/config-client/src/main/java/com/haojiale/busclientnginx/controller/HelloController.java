package com.haojiale.busclientnginx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author haojiale
 * @Date 2019/01/08 12:58
 * @Version 1.0
 **/
@RefreshScope //使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/name")
    public String show(){
        return name;
    }
}
