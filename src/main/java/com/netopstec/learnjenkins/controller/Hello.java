package com.netopstec.learnjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhenye 2018/3/14
 */
@RestController
public class Hello {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/jenkins")
    public String sayToJenkins() {
        return "The first time to learn jenkins";
    }
}
