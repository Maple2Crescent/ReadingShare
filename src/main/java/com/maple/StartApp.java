package com.maple;

import com.maple.model.TestUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration  //1开启自动配置
@ComponentScan  //2开启bean扫描
@RestController //3spring mvc的rest控制器方法@RestController
@SpringBootApplication
public class StartApp {

    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("into index---------------------------------");
        TestUser single = new TestUser();
        single.setUserName("test");
        single.setUserDesc("测试1");
        List<TestUser> people = new ArrayList<>();
        TestUser p1 = new TestUser();
        p1.setUserName("test2");
        p1.setUserDesc("测试2");

        people.add(p1);
        people.add(single);
        ModelAndView mv = new ModelAndView("index"); //到指定页面index.html
        mv.addObject("single", single);
        mv.addObject("people", people);
        System.out.println("into index---------------------------------"+single.getUserName());
        return mv;
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
