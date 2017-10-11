package com.maple.controller;

import com.maple.model.Post;
import com.maple.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("into home---------------------------------");
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("msgTitle","测试标题");
        result.put("msgContent","测试内容");
        result.put("msgExtraInfo","额外信息，只对管理员显示");
        List<Post> postList = postService.getPostList();
        System.out.println("------now post size:"+postList.get(0).getPostTime().toString());
        return new ModelAndView("home",result); //到指定页面index.html
    }
}
