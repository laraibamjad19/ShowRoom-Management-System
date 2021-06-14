/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class UserBookingDetailController {
    Connection customerCon;
    Statement customerStmt;
    
    UserBookingDetailController() {
        try {            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connection = "jdbc:sqlserver://localhost:1433;databaseName=admindb";
            customerCon= (Connection) DriverManager.getConnection(connection,"admin","1234");
            this.customerStmt = (Statement) this.customerCon.createStatement();
        
        } 
        catch (Exception ex) {
            Logger.getLogger(UserBookingDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void add(){
        
    }
}
