package com.maple;

import com.maple.model.User;
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
        User single = new User("1","test1");
        List<User> people = new ArrayList<>();
        User p1 = new User("2", "test2");
        User p2 = new User("3", "test3");
        User p3 = new User("4", "test4");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        ModelAndView mv = new ModelAndView("index"); //到指定页面index.html
        mv.addObject("single", single);
        mv.addObject("people", people);
        System.out.println("into index---------------------------------"+single.getUserName());
        return mv;
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }
}
