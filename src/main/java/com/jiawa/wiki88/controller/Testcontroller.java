package com.jiawa.wiki88.controller;

import com.jiawa.wiki88.domain.Test;
import com.jiawa.wiki88.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Testcontroller {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;


   /* @PostMapping
    @PutMapping
    @DeleteMapping
    @RequestMapping(value = "/user/1",method = RequestMethod.GET)*/
    @GetMapping("/hello")
    public String hello(){
        return "hello JUN" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello JUN!Post," + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
