package com.maple.service;

import com.maple.mapper.PostMapper;
import com.maple.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> getPostList(){
        Map<String,Object> parameter = new HashMap<String, Object>();
        return postMapper.getPostList(parameter);
    }
}
