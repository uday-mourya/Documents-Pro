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
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dell
 */
public class Update3 extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session=request.getSession();
              
              Object id=session.getAttribute("UserId");
              
            /* TODO output your page here. You may use following sample code. */
//           String name  = request.getParameter("name");
//           String fname  = request.getParameter("fname");
//           String email  = request.getParameter("email");
//           String pass  = request.getParameter("pass");
//           String contact  = request.getParameter("mobno");
           
           
            String name  = request.getParameter("name");
           String fname  = request.getParameter("fname");
           String email  = request.getParameter("email");
           String pass  = request.getParameter("pass");
           String contact  = request.getParameter("mobno");
           
           
               Connection con=null;        
           Class.forName("com.mysql.cj.jdbc.Driver");
          con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
             String sql1="update reginfo set Name=?,FName=?,Email=?,Password=?,Contact=? where UserId="+(int) id+"'";
             PreparedStatement ps = con.prepareStatement(sql1);
//             ps = con.prepareStatement(sql1);
              ps.setString(1, name);
              ps.setString(2,fname);
              ps.setString(3, email);
              ps.setString(4, pass);
              ps.setString(5,contact);
//              ps.setInt(6, (int) id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update3.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
