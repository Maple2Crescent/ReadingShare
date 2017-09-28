package com.maple.config;
import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/druid/*",initParams = {@WebInitParam(name = "resetEnable", value = "false")})
public class DruidStatViewServlet extends StatViewServlet {
       private static final long serialVersionUID = 1L;
}
