package com.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test1")
public class TestController {


    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return  "这是一个测试";
    }
}
