package com.maple.mapper;

import com.maple.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PostMapper {
    List<Post> getPostList(Map parameter);
}
