package com.maple.controller;

import com.maple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("login"); //到指定页面index.html
        return  mv;
    }




}
