package com.example.aop.controller;

import com.example.aop.annotation.SysLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aop")
public class SysController {

    @SysLog(methodName = "信息")
    @RequestMapping(value = "/hello/{name}")
    public void test(@PathVariable String name) {
        System.out.println("验证"+name);
    }
}
