/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class LightVehicleController {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */

    Connection customerCon;
    Statement customerStmt;
    LightVehicleController(){
        try{
     
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");            
            String connection = "jdbc:sqlserver://localhost:1433;databaseName=admindb";
            customerCon= (Connection) DriverManager.getConnection(connection,"admin","1234");
            this.customerStmt = (Statement) this.customerCon.createStatement(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    int[] getAllQuantities() throws SQLException{
        int[] array = null;
        ArrayList<String> sarr = new ArrayList<>();
        String s=null;
        String query = "select quantity from dbo.lvehicles";
        try{
            PreparedStatement preparedStmt = this.customerCon.prepareStatement(query);        
            ResultSet rs = preparedStmt.executeQuery();
            
            while(rs.next()){
                s = rs.getString(1);
                sarr.add(s);
                
            }
            array = new int[sarr.size()];
            for(int i=0; i<sarr.size();i++){
                array[i] = Integer.parseInt(sarr.get(i));
                System.out.println(array[i]);
            }
       }
        catch(Exception e){
            System.out.println(e);
        }
        
        return array;
    }
    
    void updateQuantity(String name, int quantity){
        if(quantity == -1)
            return;
        String query = "update lvehicles  set quantity=? where name=?";
        PreparedStatement preparedStmt;
        try {
            preparedStmt = this.customerCon.prepareStatement(query);
            preparedStmt.setString(1, Integer.toString(quantity));
            preparedStmt.setString(2, name);
            preparedStmt.executeQuery();
            
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        
        
    }
}

