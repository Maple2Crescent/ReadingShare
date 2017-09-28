package com.hsbc.mf.config.ds;
import javax.servlet.annotation.WebServlet;import javax.servlet.annotation.WebInitParam;
import com.alibaba.druid.support.http.StatViewServlet;
@WebServlet(urlPatterns = "/druid/*", initParams = {  @WebInitParam(name = "resetEnable", value = "false") })public class DruidStatViewServlet extends StatViewServlet {
 private static final long serialVersionUID = 1L;
}
