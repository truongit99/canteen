/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LamPinkieee
 */
public class Connect {
    static Connection conn;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen", "root", "");
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
