package com.maple.controller;

import com.maple.model.User;
import com.maple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public ModelAndView showRegisterPage(){
        System.out.println("---------------------register get-----------------------------");
        ModelAndView mv = new ModelAndView("register");
        mv.addObject("user",new User());
        mv.addObject("errorMsg","");
        return mv;
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public ModelAndView register(User user){
        System.out.println("---------------------register post-----------------------------");
        ModelAndView mv = new ModelAndView();
        boolean isExist = userService.existUser(user.getUserName());
        if(isExist){
            mv.setViewName("register");
            mv.addObject("user",user);
            mv.addObject("errorMsg","用户名已存在，请选择其它用户名");
        }
        else{
            userService.saveUser(user);
            mv.setViewName("login");
            mv.addObject("registerMsg","用户名["+user.getUserName()+"]已注册成功，请登录账户进行使用");
        }
        return mv;
    }
}
