package com.maple.config;

public class Response {

    private Object data;
    private  String status;
    private  String messageCode;
    private String message;

    public static final String STATUS_SUCCESS = "SUCCESS";
    public static final String STATUS_WARNING = "WARNING";
    public static final String STATUS_ERROR = "ERROR";
    public static final String STATUS_FATAL = "FATAL";

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
