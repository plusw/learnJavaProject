package com.plusw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jabc快速入门 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        String url="jdbc:mysql://127.0.0.1:3306/db1";
        String username="root";
        String password="1234";
        Connection conn=DriverManager.getConnection(url,username,password);

        String sql="UPDATE stu SET NAME ='b' WHERE NAME='a';";
        Statement stmt=conn.createStatement();
        int count=stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
