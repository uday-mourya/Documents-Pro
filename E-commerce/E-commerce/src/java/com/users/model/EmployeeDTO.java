
package com.users.model;

import com.users.service.DBCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDTO {
    
    public boolean emplogin(EmployeeDAO edao) throws SQLException{
        boolean b=false;
        
        Connection con=DBCon.DBConnnection();
         ResultSet rs;
        String query = "SELECT * FROM employee WHERE email=? AND password=?";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(query);
            ps.setString(1,edao.getEmail());

            
            String pass = edao.getPassword();
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
                
                edao.setEmail(rs.getString("email"));
                edao.setName(rs.getString("name"));
                edao.setFname(rs.getString("fname"));
                edao.setPassword(rs.getString("password"));
                edao.setContact(rs.getString("contact"));
                edao.setId(rs.getInt("id"));
                b = true;
            }
        } catch (SQLException ex) {
           System.out.println("Exception occur"+ex.getMessage());
        }
        return b;
        
        
    }
    public static boolean insert(EmployeeDAO edao){
           boolean b=false;
           Connection con=null;
            //ResultSet rs;
            PreparedStatement ps;
             String query = "insert into employee(name,fname,email,password,contact) values(?,?,?,?,?)";
        try {
              con=DBCon.DBConnnection();
              ps = con.prepareStatement(query);
              ps.setString(1,edao.getName());
              ps.setString(2,edao.getFname());
              ps.setString(3, edao.getEmail());
              String pass = edao.getPassword();
              byte[] enc = pass.getBytes();
              String encname = "";
              for (int i = 0; i < enc.length; i++) {
                if (!encname.isEmpty()) {
                    encname += "A";
                }
                int modi = enc[i] * 2;
                encname += modi;
             }
             ps.setString(4, encname);
             ps.setString(5,edao.getContact());
             if(ps.executeUpdate()>0){
                 b=true;
             }                  
        } catch (SQLException ex) {
            System.out.println("An error occurs");
        }
           return b;
    }
    public boolean passwordUpdate(EmployeeDAO edao) throws SQLException{
         boolean b=false;
         Connection con=DBCon.DBConnnection();
         ResultSet rs;
         PreparedStatement ps;
         String query="update employee set password=? where id=?";
         ps=con.prepareStatement(query);
         String pass = edao.getPassword();
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
            ps.setInt(2,edao.getId());
            if(ps.executeUpdate()>0){
                 b=true;
            }
         
         return b;
    
    }
}
