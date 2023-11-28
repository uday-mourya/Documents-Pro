/*qqi
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user.model;

import com.employee.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class userDTO {

    public boolean login(userDAO udao) {
        boolean b = false;

        try (Connection con = GetConnection.getConnection(); PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE email=? AND password=?")) {
            ps.setString(1, udao.getEmail());
            ps.setString(2, udao.getPassword());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("piyush");
                    System.out.println(udao.getPassword());

                    udao.setName(rs.getString("name"));
                    udao.setFname(rs.getString("fname"));
                    udao.setEmail(rs.getString("email"));
                    udao.setMobile(rs.getString("mobile"));
                    udao.setAddress(rs.getString("address"));
                    udao.setId(rs.getInt(1));

                    b = true;
                }
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return b;
    }

//public boolean login(userDAO udao){
//     boolean b=false;
//    
//    Connection con =GetConnection.getConnection();
//    if(con!=null){
//     System.out.println("abhi");
//     String s="select * from user where email=? and password";
//    }
//     
//     return  b;
//}
    public boolean insert(userDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "insert into user(name,fname,email,password,mobile,address)values(?,?,?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
                ps.setString(2, edao.getFname());
                ps.setString(3, edao.getEmail());
                ps.setString(4, edao.getPassword());
                ps.setString(5, edao.getMobile());
                ps.setString(6, edao.getAddress());
                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean update(userDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "update  user set name=?,fname=?,password=?,mobile=?,address=? where email=?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
                ps.setString(2, edao.getFname());

                ps.setString(3, edao.getPassword());
                ps.setString(4, edao.getMobile());
                ps.setString(5, edao.getAddress());
                ps.setString(6, edao.getEmail());
                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean updatepass(userDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "update  employee set password=? where email=?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, edao.getPassword());
                ps.setString(2, edao.getEmail());
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

    public boolean delete(userDAO edao) {
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

    public boolean search_id(userDAO edao) {
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

                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean search_name(userDAO edao) {
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

                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean search_salary(userDAO edao) {
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

                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }

    public boolean search_email(userDAO edao) {
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

                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }
}
