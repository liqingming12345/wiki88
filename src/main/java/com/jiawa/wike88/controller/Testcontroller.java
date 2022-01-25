package com.jiawa.wike88.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Testcontroller {

    /**
     * GET, POST, PUT, DELETE
     *
     * /user?id=1
     * /user/1
     * @return
     */
   /* @PostMapping
    @PutMapping
    @DeleteMapping
    @RequestMapping(value = "/user/1",method = RequestMethod.GET)*/
    @GetMapping("/hello")
    public String hello(){
        return "hello JUN";
    }
}
