package com.maple;

import com.maple.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration  //1开启自动配置
@ComponentScan  //2开启bean扫描
@RestController //3spring mvc的rest控制器方法
@SpringBootApplication
public class StartApp {

    @RequestMapping("/")
    public String index(Model model) {
        User single = new User("1","test1");
        List<User> people = new ArrayList<>();
        User p1 = new User("2", "test2");
        User p2 = new User("3", "test3");
        User p3 = new User("4", "test4");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }
}
