/*qqi
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.employee.model;

import com.employee.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


public class employeeDTO {

    public boolean login(employeeDAO edao) {
        boolean b = false;
        Connection con=GetConnection.getConnection();
        
            String sql="select * from employee where email=? and password=?";
            
            try {
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setString(1, edao.getEmail());
                ps.setString(2,edao.getPassword());
               ResultSet rs = ps.executeQuery();

                if(rs.next()){
                    edao.setName(rs.getString("name"));
                   edao.setEmail(rs.getString("email"));
                    edao.setMobile(rs.getString("mobile"));
                    edao.setSalary(rs.getString("salary"));
                    edao.setId(rs.getInt(1));
                     b=true;
                                         
    
                }
            } catch(Exception ex){
                
            }
           
        
        return b;

    }

    public boolean insert(employeeDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "insert into employee(name,email,password,mobile,salary)values(?,?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
                ps.setString(2, edao.getEmail());
                ps.setString(3, edao.getPassword());
                ps.setString(4, edao.getMobile());
                ps.setString(5, edao.getSalary());
                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean update(employeeDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "update  employee set name=?,password=?,mobile=? where email=?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
//                  ps.setString(2, edao.getEmail());
                ps.setString(2, edao.getPassword());
                ps.setString(3, edao.getMobile());
                ps.setString(4, edao.getEmail());
//                ps.setInt(5, edao.getId());

                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }
    public boolean updatePassword(int userId, String newPassword) {
        try {
             Connection con = GetConnection.getConnection();
            String query = "UPDATE users SET password = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, newPassword);
                preparedStatement.setInt(2, userId);

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

     public boolean updatepass(employeeDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "update  employee set password=? where email=?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
               
                ps.setString(1, edao.getPassword());
               
//                ps.setInt(5, edao.getId());

                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean delete(employeeDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "delete from employe where email=? ";
            try {
                PreparedStatement ps = con.prepareStatement(sql);

                
                ps.setString(1, edao.getEmail());
                
                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }
    

    public boolean search_id(employeeDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "Select * from where id=?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
                ps.setString(2, edao.getEmail());
                ps.setString(3, edao.getPassword());
                ps.setString(4, edao.getMobile());
                ps.setString(5, edao.getSalary());
                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean search_name(employeeDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "delete from employe where name=? ";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
                ps.setString(2, edao.getEmail());
                ps.setString(3, edao.getPassword());
                ps.setString(4, edao.getMobile());
                ps.setString(5, edao.getSalary());
                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean search_salary(employeeDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "delete from employe where salary=? ";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
                ps.setString(2, edao.getEmail());
                ps.setString(3, edao.getPassword());
                ps.setString(4, edao.getMobile());
                ps.setString(5, edao.getSalary());
                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean search_email(employeeDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "delete from employe where email=? ";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
                ps.setString(2, edao.getEmail());
                ps.setString(3, edao.getPassword());
                ps.setString(4, edao.getMobile());
                ps.setString(5, edao.getSalary());

                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
