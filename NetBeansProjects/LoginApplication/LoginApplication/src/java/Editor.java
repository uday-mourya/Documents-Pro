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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author T460
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Editor</title>");
            out.println("</head>");
            out.println("<body>");
            String uid = request.getParameter("UserId");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "Aman@8271");
                PreparedStatement pst = con.prepareStatement("SELECT * FROM reginfo WHERE UserId = ?");
                pst.setString(1, uid);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    out.println("<form action='Editinfo' method='POST'>");
                    out.println("<table>");
                    out.println("<tr><td>UserId</td><td><input type='text' name='userid' id='userid' value='" + rs.getString("UserId") + "'/></td></tr>");
                    out.println("<tr><td>Name</td><td><input type='text' name='name' id='name' value='" + rs.getString("Name") + "'/></td></tr>");
                    out.println("<tr><td>Fname</td><td><input type='text' name='fname' id='fname' value='" + rs.getString("Fname") + "'/></td></tr>");
                    out.println("<tr><td>Email</td><td><input type='text' name='email' id='email' value='" + rs.getString("Email") + "'/></td></tr>");
                    out.println("<tr><td>Password</td><td><input type='text' name='password' id='password' value='" + rs.getString("Password") + "'/></td></tr>");
                    out.println("<tr><td>Contact</td><td><input type='text' name='contact' id='contact' value='" + rs.getString("Contact") + "'/></td></tr>");
                    out.println("<tr><td colspan='2'><input type='submit' value='Edit'/></td></tr>");
                    out.println("</table>");
                    out.println("</form>");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                // Handle exceptions here, e.g., send an error response to the client.
                out.println("An error occurred: " + ex.getMessage());
                ex.printStackTrace();
            }
            out.println("</body>");
            out.println("</html>");
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
