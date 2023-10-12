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
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class DataUpdate extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession s=request.getSession();
            Object id=s.getAttribute("email");
            out.println(id);
             String name  = request.getParameter("newname");
             String fname  = request.getParameter("newfname");
          
           String pass  = request.getParameter("newpass");
           String mobile  = request.getParameter("newcontact");
               Connection con=null;        
           Class.forName("com.mysql.cj.jdbc.Driver");
          con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Server", "root", "udaysql@350");
             String sql1="update registration set Name=?,Fname=?,Password=?,Mobile=? where Email=?";
             PreparedStatement ps = con.prepareStatement(sql1);
             ps = con.prepareStatement(sql1);
              ps.setString(1, name);
              ps.setString(2,fname);
              ps.setString(3, pass);
              ps.setString(4,mobile);
              ps.setString(5, (String)id);
              int count=ps.executeUpdate();
              
              if(count>0)
              {
                     response.setContentType("text/html");
                     out.println("<h4><font color='green'>Update successful</font></h4>");
                     response.sendRedirect("Dashboard");
              }
              else
              {
               response.setContentType("text/html");
               out.println("<h2><font color='red'>Update Failed</font><h2>");
              }

        } catch (SQLException ex) {
            Logger.getLogger(DataUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
