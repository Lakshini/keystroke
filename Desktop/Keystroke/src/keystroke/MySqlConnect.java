/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Madushi
 */


public class MySqlConnect {
  
   Statement statement;
    private static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL="jdbc:derby:Keystroke;create=true";
    
    Connection conn;
    public MySqlConnect(){
         try {
            this.conn=DriverManager.getConnection(JDBC_URL);
            if(this.conn!=null){
            System.out.println("Connected to Database ");
        }} catch (SQLException ex) {
            Logger.getLogger(MySqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void createTable(){
        try {
            DatabaseMetaData dbm=conn.getMetaData();
            ResultSet table1=dbm.getTables(null, null, "userdata", null);
            if(table1.next()){
                 conn.createStatement().execute("create table userdata(username varchar(50), password varchar(50),average Float )");
            }else{
                
            }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public void InsertIntoTable(String username,String password,Float average){
        try {
            conn.createStatement().execute("insert into userdata values ('"+username+"','"+password+"',"+average+")");
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
      
       public void PrintAll(){
        try{
            statement=this.conn.createStatement();
            ResultSet res;
             
                res = statement.executeQuery("select * from userdata");
                 while(res.next()){
                System.out.println(res.getString("username")+" "+res.getString("average"));
                 }
            } catch (SQLException ex) {
                Logger.getLogger(MySqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
     
        
    }
       public void Login(String username, String password ,Float valuePressReleaseAVG){
            String Sql="select * from userdata where username=? and password=?";
        try{
            PreparedStatement pst = conn.prepareStatement(Sql);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String sql="select average from userdata where username=username and password=password";
                Long AvgValue = Long.valueOf(rs.getString("average"));
                float variance =(Math.abs(valuePressReleaseAVG-AvgValue));
                float percentage = variance*100/AvgValue;
                //System.out.println(variance);
                //System.out.println(AvgValue);
                if(percentage<10.0){
                    JOptionPane.showMessageDialog(null, "Logged successfully");
                }else{
                    JOptionPane.showMessageDialog(null, "Logging Fail");
                }
                
            }
        }catch(Exception e){
            
        }}
       }
   
    

    
            

