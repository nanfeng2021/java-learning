package com.nanfeng.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 14802
 * @Description TODO
 * @Date 2022/10/27 18:38
 * @Version 1.0
 * @Since 1.0
 */
@Controller
public class HelloController {

    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }
}
