package com.maple.service;

import com.maple.mapper.UserMapper;
import com.maple.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        System.out.println("s:"+s);
        System.out.println(user.getAuthorities());
        System.out.println("username:"+user.getUsername()+";password:"+user.getPassword());
        return user;
    }

    public boolean existUser(String userName){
        User user = userMapper.findByUsername(userName);
        if(user == null){
            return  false;
        }
        else{
            return  true;
        }
    }

    @Transactional("transactionManager")
    public void saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userMapper.saveUser(user);

        Map<String,Object> parameter = new HashMap<String,Object>();
        parameter.put("userId",user.getUserId());
        parameter.put("roleName",user.getRoleName());
        userMapper.saveUserRoleMap(parameter);
    }

    public boolean changePassword(User user, String newPwd, String oldPwd){
       if(!passwordEncoder.matches(oldPwd,user.getPassword())){
           user.setPassword(passwordEncoder.encode(newPwd));
           userMapper.updateUser(user);
           return true;
       }
       else{
           return  false;
       }
    }

}
