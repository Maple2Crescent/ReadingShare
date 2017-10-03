package com.maple.controller;

import com.maple.model.User;
import com.maple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public ModelAndView showRegisterPage(){
        System.out.println("---------------------register get-----------------------------");
        ModelAndView mv = new ModelAndView("/user/register");
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
            mv.setViewName("/user/register");
            mv.addObject("user",user);
            mv.addObject("errorMsg","用户名已存在，请选择其它用户名");
        }
        else{
            userService.saveUser(user);
            mv.setViewName("login");
            mv.addObject("errorMsg","用户名["+user.getUserName()+"]已注册成功，请登录账户进行使用");
        }
        return mv;
    }

    @RequestMapping(value = "/user/changePassword",method=RequestMethod.GET)
    public ModelAndView showChangePassword(){
        System.out.println("---------------------change password get-----------------------------");
        ModelAndView mv = new ModelAndView("/user/changePassword");
        mv.addObject("errorMsg","");
        return mv;
    }

    @RequestMapping(value = "/user/changePassword",method=RequestMethod.POST)
    public ModelAndView changePassword(HttpServletRequest request){
        System.out.println("---------------------change password post-----------------------------");
        String oldpwd = request.getParameter("oldpwd");
        String newpwd = request.getParameter("newpwd");
        System.out.println("old password:"+oldpwd+"------------new password:"+newpwd);
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        boolean change = userService.changePassword(user,newpwd,oldpwd);
        System.out.println(change);
        ModelAndView mv = new ModelAndView();

        if(change){
            mv.setViewName("login");
            mv.addObject("errorMsg","密码修改成功, 请重新登录!");
        }
        else{
            mv.setViewName("/user/changePassword");
            mv.addObject("errorMsg","旧密码不正确, 请重新输入!");
        }
        return mv;
    }
}
