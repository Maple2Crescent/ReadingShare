package com.maple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("into home---------------------------------");
        Map result = new HashMap<>();
        result.put("msgTitle","测试标题");
        result.put("msgContent","测试内容");
        result.put("msgExtraInfo","额外信息，只对管理员显示");
        return new ModelAndView("home",result); //到指定页面index.html
    }
}
