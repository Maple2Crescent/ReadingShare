package com.maple.model;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("post")
public class Post {
    private int postId;
    private String title;
    private String content;
    private int userId;
    private String userName;
    private String postTime;

    private List<Comment> comments;
    private List<Admire> admires;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Admire> getAdmires() {
        return admires;
    }

    public void setAdmires(List<Admire> admires) {
        this.admires = admires;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
