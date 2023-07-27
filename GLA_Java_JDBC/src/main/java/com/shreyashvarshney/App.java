package com.shreyashvarshney;

import java.sql.*;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        // Step1-Load Driver
        // step2-Create a connection
        String password="shreravi4132";
        String username="root";
        String url="jdbc:mysql://localhost:3306/java";
        Connection connection = DriverManager.getConnection(url,username,password);

        //step3 - Create a statement object
        Statement statement = connection.createStatement();

        //step4 - Execute Query
        String readQuery = "select * from student1";
        ResultSet resultSet = statement.executeQuery(readQuery);
        while (resultSet.next()){
            System.out.println("Id: "+resultSet.getInt(1)+" , Name: "+ resultSet.getString(2));
       }
//         String udateQuery = "update student set name = 'shreyash' where id = '1'";
//        int count=  statement.executeUpdate(udateQuery);
//        System.out.println(count + " row affected");

//        String deleteQuery = "delete from student where id = '1'";
//        int count = statement.executeUpdate(deleteQuery);
//        System.out.println(count+" row affected");

//        String insertQuery = "insert into student(id,name) values (7,'shreravi')";
//        int count = statement.executeUpdate(insertQuery);
//        System.out.println(count + " row affected");
//        //step5 - Close Connection
//         connection.close();
    }
}
