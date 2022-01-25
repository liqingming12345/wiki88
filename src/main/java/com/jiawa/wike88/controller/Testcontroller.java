package com.jiawa.wike88.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Testcontroller {

    @Value("${test.hello:TEST}")
    private String testHello;


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
}
