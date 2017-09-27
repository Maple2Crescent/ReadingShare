package com.maple.mapper;

import com.maple.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
     User getUserInfo();
}
