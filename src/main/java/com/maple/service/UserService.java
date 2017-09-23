package com.maple.service;

import com.maple.mapper.UserMapper;
import com.maple.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public String getUserName(){
        return  userMapper.getUserInfo().getUserName();
    }
}
