package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello"; //comment1
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello2";
    }

    @RequestMapping("/hello3")
    public String hello3(){
        return "hello3";
    }

    @RequestMapping("/hello4")
    public String hello4(){
        return "hello4";
    }

    @RequestMapping("/hello5")
    public String hello5(){
        return "hello5";//branch feature1 comment add
    }
}
