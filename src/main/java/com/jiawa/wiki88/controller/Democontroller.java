package com.jiawa.wiki88.controller;

import com.jiawa.wiki88.domain.Demo;
import com.jiawa.wiki88.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class Democontroller {

    @Resource
    private DemoService demoService;

    @GetMapping("list")
    public List<Demo> list(){
        return demoService.list();
    }
}
