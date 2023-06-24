package com.StudentDatabase;

import java.sql.*;

public class CreateConnection {

    static Connection con;

    public static Connection Connect() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/StudentDB";
            String user = "root";
            String pwd = "toor";
            con = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }
}
