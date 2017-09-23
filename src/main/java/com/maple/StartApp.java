package com.maple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration  //1开启自动配置
//@ComponentScan  //2开启bean扫描
@RestController //3spring mvc的rest控制器方法
@SpringBootApplication
public class StartApp {

    @RequestMapping("/")
    String home() {
        System.out.println("----------------------------------------------");
        return "Hello Maple!";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }
}
