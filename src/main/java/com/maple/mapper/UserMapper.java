package com.maple.mapper;

import com.maple.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {
     User findByUsername(String userName);
     void saveUser(User user);
     void deleteUser(Long userId);
     void updateUser(User user);
     void saveUserRoleMap(Map parameter);
}
