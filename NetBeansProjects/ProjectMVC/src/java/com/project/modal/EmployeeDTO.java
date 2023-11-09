/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.modal;
import java.security.NoSuchAlgorithmException;  
import java.security.MessageDigest;  

import java.sql.*;
import com.project.service.GetConnection;

/**
 *
 * @author hp
 */
public class EmployeeDTO {
    
    public boolean login(EmployeeDAO edao){
        
        boolean b = false;
        
            Connection gcon = GetConnection.getConnection();
            String pass = edao.getPassword();
           byte[] enc = pass.getBytes();
            String encname = ""; 

            for (int i = 0; i < enc.length; i++) {
                if (!encname.isEmpty()) {
                    encname += "A"; 
                }
                        int modifiedValue = enc[i] * 2;
                        encname += modifiedValue;
                }
                    String selectSql = "SELECT * FROM employee2 WHERE email = ? AND password = ?";

                    try (PreparedStatement selectPs = gcon.prepareStatement(selectSql)) {
                        selectPs.setString(1, edao.getEmail());
                        selectPs.setString(2, encname);
                        
                        
                        ResultSet rs = selectPs.executeQuery();

                        if (rs.next()) {
                            // Login successful
                            b = true;
                             
                            edao.setName(rs.getString("name"));
                            System.out.println(""+rs.getInt("id"));
                            edao.setId(rs.getInt("id"));
                            edao.setFname(rs.getString("fname"));
                            edao.setMobile(rs.getString("mobile"));
                            edao.setEmail(rs.getString("email"));
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (gcon != null) {
                                gcon.close();
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }

  
        
        return b;
        
    }
    public boolean insertData(EmployeeDAO edao) {
        Connection gcon = GetConnection.getConnection();
    boolean success = false;
    
    
    String selectSql = "SELECT * FROM employee WHERE email = ?";
    String insertSql = "INSERT INTO employee2 (name, fname, email, password, mobile) VALUES (?, ?, ?, ?, ?)";

    try (PreparedStatement selectPs = gcon.prepareStatement(selectSql);
         PreparedStatement insertPs = gcon.prepareStatement(insertSql)) {

        selectPs.setString(1, edao.getEmail());
        ResultSet rs1 = selectPs.executeQuery();

        if (!rs1.next()) {
            insertPs.setString(1, edao.getName());
            insertPs.setString(2, edao.getFname());
            insertPs.setString(3, edao.getEmail());
            String pass = edao.getPassword();
          byte[] enc = pass.getBytes();
            String encname = ""; 

            for (int i = 0; i < enc.length; i++) {
                if (!encname.isEmpty()) {
                    encname += "A"; 
                }
                        int modifiedValue = enc[i] * 2;
                        encname += modifiedValue;
                }
            insertPs.setString(4, encname);
            insertPs.setString(5, edao.getMobile());

            int rowsInserted = insertPs.executeUpdate();
            if (rowsInserted > 0) {
                success = true;
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (gcon != null) {
                gcon.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    return success;
}
    public boolean Update(EmployeeDAO edao) {
    Connection gcon = GetConnection.getConnection();
    boolean success = false;

    String selectSql = "SELECT * FROM employee WHERE email = ?";
    String updateSql = "UPDATE employee SET name=?, fname=?, email=?, mobile=? WHERE id = ?";

    try (PreparedStatement selectPs = gcon.prepareStatement(selectSql);
         PreparedStatement updatePs = gcon.prepareStatement(updateSql)) {
        System.out.println(""+edao.getId());
        selectPs.setString(1,edao.getOldemail());
        System.out.println(""+edao.getOldemail());
        ResultSet rs1 = selectPs.executeQuery();

        if (rs1.next()) {
            
                
                updatePs.setString(1, edao.getName());
                updatePs.setString(2, edao.getFname());
                updatePs.setString(3, edao.getEmail());
                updatePs.setString(4, edao.getMobile());
                updatePs.setInt(5, edao.getId());

                int rowsUpdated = updatePs.executeUpdate();
                System.out.println("" + rowsUpdated);

                if (rowsUpdated > 0) {
                    success = true;
                }
            
        } else {
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (gcon != null) {
                gcon.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
   
}
     return success;
    }
    public boolean  getEmployeeById(EmployeeDAO edao,int id){
        boolean b = false;
         Connection gcon = GetConnection.getConnection();
            
                    String selectSql = "SELECT * FROM employee WHERE id=?";

                    try (PreparedStatement selectPs = gcon.prepareStatement(selectSql)) {
                        selectPs.setInt(1,id);
                        
                        
                        
                        ResultSet rs = selectPs.executeQuery();

                        if (rs.next()) {
                            // Login successful
                            b = true;
                             
                            edao.setName(rs.getString("name"));
                            System.out.println(""+rs.getInt("id"));
                            edao.setId(rs.getInt("id"));
                            edao.setFname(rs.getString("fname"));
                            edao.setMobile(rs.getString("mobile"));
                            edao.setEmail(rs.getString("email"));
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (gcon != null) {
                                gcon.close();
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }


        return b;
    }
}


