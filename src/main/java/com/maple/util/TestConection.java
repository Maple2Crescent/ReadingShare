package com.maple.util;

import java.sql.*;

public class TestConection {
    public static void  main(String []args) throws SQLException, ClassNotFoundException {
        String sql="jdbc:sqlite::resource:data/data.db";
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(sql);
        Statement stat = conn.createStatement();
        ResultSet rs =  stat.executeQuery("select * from user;");
        while (rs.next()) { //将查询到的数据打印出来
            System.out.print("user id = " + rs.getString("USER_ID") + " "); //列属性一
            System.out.println("user name  = " + rs.getString("USER_NAME")); //列属性二
        }
        rs.close();
        conn.close(); //结束数据库的连接

    }

}
