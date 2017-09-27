package com.maple.controller;

import com.maple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/getUserName")
    public String getUserName(String userId){
        System.out.println("-----------Into getUserName method-----------");
         return userService.getUserName();
    }




}
