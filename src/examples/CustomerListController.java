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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class CustomerListController {
    Connection customerCon;
    Statement customerStmt;
    
    ArrayList<String> Cnics = new ArrayList<>();
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<String> Status = new ArrayList<>();
    
    ResultSet rs;
    
    CustomerListController(){
        try{
     
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");            
            String connection = "jdbc:sqlserver://localhost:1433;databaseName=admindb";
            customerCon= (Connection) DriverManager.getConnection(connection,"admin","1234");
            this.customerStmt = (Statement) this.customerCon.createStatement();
            String query = "select * from dbo.CustomersList";
            try{
                PreparedStatement preparedStmt = this.customerCon.prepareStatement(query);        
                rs = preparedStmt.executeQuery();
                String s;
                int i=0;
                while(rs.next()){
                    s = rs.getString(1);
                    this.Cnics.add(s);
                    s = rs.getString(2);
                    this.Name.add(s);
                    s = rs.getString(3);
                    this.Status.add(s);
                    }

            }
            catch(Exception e){
                System.out.println(e);
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    void add(String cnic,String name, String status){
         String query = "insert into dbo.CustomersList values (?,?,?)";
            try{
               PreparedStatement preparedStmt = (PreparedStatement) this.customerCon.prepareStatement(query);
            
                preparedStmt.setString(1,cnic);
                preparedStmt.setString(2, name);
                preparedStmt.setString(3, status);
                preparedStmt.executeUpdate();

               

            }
            catch(Exception e){
                System.out.println(e);
            }
    }
    
    void setTable(JTable table){
       ((DefaultTableModel) table.getModel()).setNumRows(this.Cnics.size());
       for(int i=0; i<this.Cnics.size(); i++){
           table.setValueAt(this.Cnics.get(i), i, 0);
           table.setValueAt(this.Name.get(i), i, 1);
           table.setValueAt(this.Status.get(i), i, 2);

       }
       
    }
    
    public ArrayList<String> getCnics() {
        return Cnics;
    }

    public ArrayList<String> getName() {
        return Name;
    }

    public ArrayList<String> getStatus() {
        return Status;
    }

   

    public ResultSet getRs() {
        return rs;
    }
    
    public String cincAtIndex(int i){
        return this.Cnics.get(i);
    }
    
}
