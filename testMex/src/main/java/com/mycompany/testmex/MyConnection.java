package com.mycompany.testmex;
import java.sql.*;
/**
 *
 * @author Martino Maniero & Alessandro Bergantin
 */
public class MyConnection {
     public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/testchat", "root", "Aaron2011");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}    
    
                                        