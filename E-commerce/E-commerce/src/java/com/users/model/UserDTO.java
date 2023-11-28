/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.model;
import com.users.service.DBCon;
import java.sql.*;
/**
 *
 * @author T460
 */
public class UserDTO {
    
    
    
    public boolean userlogin(UserDAO udao) throws SQLException{
        boolean b=false;
        
        Connection con=DBCon.DBConnnection();
         ResultSet rs;
        String query = "SELECT * FROM users WHERE email=? AND password=?";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(query);
            ps.setString(1,udao.getEmail());

            
            String pass = udao.getPassword();
            byte[] enc = pass.getBytes();
            String encname = "";

            for (int i = 0; i < enc.length; i++) {
                if (!encname.isEmpty()) {
                    encname += "A";
                }
                int modi = enc[i] * 2;
                encname += modi;
            }
     
            ps.setString(2, encname);
            rs = ps.executeQuery();
            if (rs.next()) {
                udao.setEmail(rs.getString("email"));
                udao.setName(rs.getString("name"));
                udao.setId(rs.getInt("id"));
                b = true;
            }
        } catch (SQLException ex) {
           System.out.println("Exception occur"+ex.getMessage());
        }
        return b;
        
        
    }
    
    public static boolean insert(UserDAO udao){
           boolean b=false;
           Connection con=null;
            ResultSet rs;
            PreparedStatement ps;
             String query = "insert into users(name,email,password) values(?,?,?);";
        try {
             con=DBCon.DBConnnection();
             ps = con.prepareStatement(query);
              ps.setString(1,udao.getName());
              ps.setString(2, udao.getEmail());
              String pass = udao.getPassword();
              byte[] enc = pass.getBytes();
              String encname = "";

              for (int i = 0; i < enc.length; i++) {
                if (!encname.isEmpty()) {
                    encname += "A";
                }
                int modi = enc[i] * 2;
                encname += modi;
             }

            ps.setString(3, encname);
            
            if(ps.executeUpdate()>0){
                 b=true;
            }          
            
        } catch (SQLException ex) {
            System.out.println("An error occurs");
        }
           return b;
    }
    
    public boolean passwordUpdate(UserDAO udao) throws SQLException{
         boolean b=false;
         Connection con=DBCon.DBConnnection();
         ResultSet rs;
         PreparedStatement ps;
         String query="update users set password=? where id=?";
         ps=con.prepareStatement(query);
         String pass = udao.getPassword();
            byte[] enc = pass.getBytes();
            String encname = "";

            for (int i = 0; i < enc.length; i++) {
                if (!encname.isEmpty()) {
                    encname += "A";
                }
                int modi = enc[i] * 2;
                encname += modi;
            }
            ps.setString(1, encname);    
            ps.setInt(2,udao.getId());
            if(ps.executeUpdate()>0){
                 b=true;
            }
         
         return b;
    
    }
    
    
}
