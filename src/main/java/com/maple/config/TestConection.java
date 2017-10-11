package com.maple.config;

import com.maple.model.Post;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.*;

public class TestConection {
    public static void  main(String []args) throws SQLException, ClassNotFoundException {
        String sql="jdbc:sqlite:data/dev_data.db";
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(sql);
        Statement stat = conn.createStatement();
        ResultSet rs =  stat.executeQuery("select * from post order by post_time desc;");
        while (rs.next()) { //将查询到的数据打印出来
            System.out.print("post id = " + rs.getString("post_id") + " "); //列属性一
            System.out.print("title  = " + rs.getString("title") + " "); //列属性二
            System.out.print("content  = " + rs.getString("content") + " "); //列属性二
            System.out.println("time  = " + rs.getString("post_time")); //列属性二
            Post post = new Post();
            post.setPostId(rs.getInt("post_id"));
            post.setPostTime( rs.getString("post_time"));
            System.out.println(post.getPostTime());
        }
        rs.close();
        conn.close(); //结束数据库的连接

        String password = "123";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        System.out.println(passwordEncoder.encode(password));
        System.out.println(passwordEncoder.matches("1111111111111111","$2a$10$GOu/a9bP4RhD24h//wWEAOiBOP1RFbKuHb79MWRDOzzgatv2UQWNa"));

    }

}
