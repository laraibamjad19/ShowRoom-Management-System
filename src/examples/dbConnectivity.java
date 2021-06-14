/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author imamah
 */

import java.sql.Connection;
import java.sql.DriverManager;   
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class dbConnectivity {
    Connection con;
    Statement stmt;
   
    dbConnectivity() //cons
    {
        try
        {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String connection = "jdbc:sqlserver://localhost:1433;databaseName=admindb";
            con= (Connection) DriverManager.getConnection(connection,"admin","1234");
            System.out.println("Connected");

            stmt = con.createStatement();
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
