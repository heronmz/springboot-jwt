package com.hmz.springbootjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Business class
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String helloWorld(@RequestParam(value="name", defaultValue = "World") String name){
        return "Hello " + name + "!!";
    }
}
