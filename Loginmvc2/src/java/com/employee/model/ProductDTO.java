package com.employee.model;
import com.employee.service.GetConnection;
import com.user.model.CartDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T460
 */
public class ProductDTO {
    public List<ProductDAO> getAllProducts() {
    List<ProductDAO> productList = new ArrayList<>();
    try {
         Connection con = GetConnection.getConnection();
        ResultSet rs;
        PreparedStatement ps;

        String query = "SELECT * FROM products";
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();

        while (rs.next()) {
            ProductDAO product = new ProductDAO();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setCategory(rs.getString("category"));
            product.setPrice(rs.getDouble("price"));
            product.setImage(rs.getString("image"));
            productList.add(product);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return productList;
}
 public List<CartDAO> getCartProducts(ArrayList<CartDAO> cartList) throws SQLException {
        List<CartDAO> book = new ArrayList<>();
        ResultSet rs;
        PreparedStatement pst;
 Connection con = GetConnection.getConnection();        try {
            if (cartList.size() > 0) {
                for (CartDAO item : cartList) {
                    String query = "select * from products where id=?";
                    pst = con.prepareStatement(query);
                    pst.setInt(1, item.getId());
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        CartDAO row = new CartDAO();
                        row.setId(rs.getInt("id"));
                        row.setName(rs.getString("name"));
                        row.setCategory(rs.getString("category"));
                        row.setPrice(rs.getDouble("price")*item.getQuantity());
                        row.setQuantity(item.getQuantity());
                        book.add(row);
                    }

                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return book;
    }   
    public double getTotalCartPrice(ArrayList<CartDAO> cartList) throws SQLException {
        double sum = 0;
 Connection con = GetConnection.getConnection();         ResultSet rs;
        PreparedStatement pst;
        try {
            if (cartList.size() > 0) {
                for (CartDAO item : cartList) {
                    String query = "select price from products where id=?";
                    pst = con.prepareStatement(query);
                    pst.setInt(1, item.getId());
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        sum+=rs.getDouble("price")*item.getQuantity();
                    }

                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    } 
    public boolean productInsert(ProductDAO pdao) throws SQLException{
           boolean b=false;
 Connection con = GetConnection.getConnection();        
           PreparedStatement pst;
           String query = "insert into products (name,category,price,image) values(?,?,?,?)";
           try {
                
                    pst = con.prepareStatement(query);
                    pst.setString(1, pdao.getName());
                    pst.setString(2, pdao.getCategory());
                    pst.setDouble(3,     pdao.getPrice());
                    pst.setString(4,pdao.getImage());                    
                    if( pst.executeUpdate()>0){
                     b=true;
                    }
                    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
           return b;
    }

    
}
