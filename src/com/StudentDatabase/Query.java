package com.StudentDatabase;

import java.sql.*;

public class Query {
    public static boolean insertQuery(Details details) {
        boolean flag = false;

        try {
            Connection con = CreateConnection.Connect();
            String q = "insert into details(sname,scity,sphone) values(?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(q);

            //set values
            preparedStatement.setString(1, details.getStudentName());
            preparedStatement.setString(2, details.getStudentCity());
            preparedStatement.setString(3, details.getStudentPhone());
            preparedStatement.executeUpdate();
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean deleteQuery(int id) {
        boolean flag = false;
        try {
            Connection con = CreateConnection.Connect();
            String q = "delete from details where sid = ?";
            PreparedStatement preparedStatement = con.prepareStatement(q);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean displayQuery() {
        boolean flag = false;
        try {
            Connection con = CreateConnection.Connect();
            String q = "select * from details";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(q);
            System.out.println("Id\tName\tCity\t\tPhoneNumber");
            System.out.println("-----------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);
                String number = resultSet.getString(4);
                System.out.println(id + "\t" + name + "\t" + city + "\t" + number);


            }
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean updateQuery(String colName, String value, int id) {
        boolean flag = false;

        try {
            Connection con = CreateConnection.Connect();
            String q = "update details set " + colName + "= ?" + "where sid = ?";
            PreparedStatement preparedStatement = con.prepareStatement(q);
            preparedStatement.setString(1, value);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();

            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
