package com.maple.model;

import org.apache.ibatis.type.Alias;

@Alias("admire")
public class Admire {
    private int postId;
    private int userId;
    private String userName;
    private String status;
    private String admireTime;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdmireTime() {
        return admireTime;
    }

    public void setAdmireTime(String admireTime) {
        this.admireTime = admireTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
