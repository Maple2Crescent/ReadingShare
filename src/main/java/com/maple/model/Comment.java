package com.maple.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("comment")
public class Comment {
    private int comId;
    private int postId;
    private String comment;
    private int userId;
    private String userName;
    private int referId;
    private String replyTime;

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getReferId() {
        return referId;
    }

    public void setReferId(int referId) {
        this.referId = referId;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
