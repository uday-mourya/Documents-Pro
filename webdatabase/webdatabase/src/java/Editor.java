/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author dell
 */
public class Editor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Editor</title>");
            out.println("</head>");
            out.println("<body>");
            String email = request.getParameter("Email");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
                PreparedStatement pst = con.prepareStatement("SELECT * FROM registration WHERE Email = ?");
                pst.setString(1, email);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    out.println("<form action=''>");
                    out.println("<table>");
                    out.println("<tr><td>Email</td><td><input type='text' name='Email' id='Email' value='" + rs.getString("Email") + "'/></td></tr>");
                    out.println("<tr><td>Name</td><td><input type='text' name='name' id='name' value='" + rs.getString("name") + "'/></td></tr>");
                    out.println("<tr><td>Fname</td><td><input type='text' name='fname' id='fname' value='" + rs.getString("fname") + "'/></td></tr>");
                    out.println("<tr><td>Password</td><td><input type='text' name='Password' id='Password' value='" + rs.getString("Password") + "'/></td></tr>");
                    out.println("<tr><td>Mobile</td><td><input type='text' name='Mobile' id='Mobile' value='" + rs.getString("Mobile") + "'/></td></tr>");
                    out.println("<tr><td colspan='2'><input type='submit' value='Edit'/></td></tr>");
                    out.println("</table>");
                    out.println("</form>");
        }
    }       catch (ClassNotFoundException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
        }  
    }
}