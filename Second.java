package com.sr.cgi;
import java.sql.*;
public class Second {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection=DriverManager.getConnection("jdbc:mysql://localhost/database1","root","Dhiraj@123");
        PreparedStatement stmt=connection.prepareStatement("INSERT INTO Consumer values(?,?,?,?,?");
        stmt.setInt(1,77);
        stmt.setString(2,"Dhiraj");
        stmt.setString(3,"jaunpur");
        stmt.setInt(4,300);
        stmt.setInt(5,103);
        int count=stmt.executeUpdate();
        System.out.println(count+"insertion successful");
        connection.close();




    }
}
