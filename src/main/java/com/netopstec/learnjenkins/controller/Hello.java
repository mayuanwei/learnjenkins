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
        System.out.println("项目已经在jenkins上部署成功，测试git push origin master");
        return "Hello World";
    }

    @GetMapping("/jenkins")
    public String sayToJenkins() {
        System.out.println("尝试提交代码到github上后，jenkins自动构建");
        return "The first time to learn jenkins";
    }
}
