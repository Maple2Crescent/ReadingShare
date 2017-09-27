package com.maple.service;

import com.maple.config.Response;
import com.maple.mapper.UserMapper;
import com.maple.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Response getUserName(){
        User user = userMapper.getUserInfo();
        System.out.println(user.getUserId()+"----------------------------------");
        Response response = new Response();
        response.setData(user);
        response.setStatus(Response.STATUS_SUCCESS);
        return  response;
    }
}
