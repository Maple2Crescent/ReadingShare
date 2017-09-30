package com.maple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@EnableAutoConfiguration  //1开启自动配置
@ComponentScan  //2开启bean扫描
@RestController //3spring mvc的rest控制器方法@RestController
@SpringBootApplication
public class StartApp {

    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("into index---------------------------------");
        Map result = new HashMap<>();
        result.put("msgTitle","测试标题");
        result.put("msgContent","测试内容");
        result.put("msgExtraInfo","额外信息，只对管理员显示");
        return new ModelAndView("index",result); //到指定页面index.html
    }
    @RequestMapping("/hello")
    public ModelAndView hello() {
        System.out.println("into  page---------------------------------");
        ModelAndView mv = new ModelAndView("hello"); //到指定页面hello.html
        return mv;
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }
}
