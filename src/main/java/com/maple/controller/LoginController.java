package com.maple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @RequestMapping(value="/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("login");
        return  mv;
    }

    @RequestMapping(value="/page/403")
    public ModelAndView error403(){
        ModelAndView mv = new ModelAndView("pageError");
        mv.addObject("error", "HTTP Status 403 - 禁止访问该网址");
        mv.addObject("message", "当前用户没有权限此页面");
        return  mv;
    }

    @RequestMapping(value="/page/404")
    public ModelAndView error404(){
        ModelAndView mv = new ModelAndView("pageError");
        mv.addObject("error", "HTTP Status 404 - 无法访问此网站");
        mv.addObject("message", "请检查输入的网址是否正确");
        return  mv;
    }

    @RequestMapping(value="/page/500")
    public ModelAndView error500(){
        ModelAndView mv = new ModelAndView("pageError");
        mv.addObject("error", "HTTP Status 500 - 服务器无法响应请求");
        mv.addObject("message", "请联系管理员去检查服务器");
        return  mv;
    }


}
