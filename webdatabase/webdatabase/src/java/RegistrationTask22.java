/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import java.sql.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T460
 */
public class RegistrationTask22 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // Method checks phone
     public boolean isValidPhoneNumber(String phoneNumber) {
    // Check if the phone number contains only digits and has a specific length
          return phoneNumber.matches("\\d{10}");
     }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name=request.getParameter("name");
            String fname=request.getParameter("fname");
            String email=request.getParameter("email");
            String pass=request.getParameter("pass");
            String cpass=request.getParameter("cpass");
            String mycontact=request.getParameter("mobno");
           if (isValidPhoneNumber(mycontact)){
                if (!pass.equals(cpass)) {
                     out.println("Password and confirm password does not match");
                     RequestDispatcher rd=request.getRequestDispatcher("Registration22");
                     rd.include(request, response);
//                   response.setContentType("text/html");
//                   out.println("<h2><font color='red'>Password and Confirm Password do not match</font></h2>");

                    
                }
                
                
                
                else {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
             String sql="insert into reginfo(Name,Fname,Email,Password,Contact) values(?,?,?,?,?)";
              PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
              ps.setString(1, name);
              ps.setString(2,fname);
              ps.setString(3, email);
              ps.setString(4, pass);
              ps.setString(5,mycontact);
              int count=ps.executeUpdate();
              
              if(count>0)
              {

                 ResultSet generatedKeys = ps.getGeneratedKeys();
                 if (generatedKeys.next()) {
                     int generatedID = generatedKeys.getInt(1); // Assuming it's an integer
                     response.setContentType("text/html");
                     out.println("<h2><font color='green'>Registration successful</font></h2>");
                     out.println("<p>Your generated ID is: " + generatedID + "</p>");
                      response.sendRedirect("Login4");
                     
                  }
              }
              else
              {
                   out.println("Registration not successfull");
                   RequestDispatcher rd=request.getRequestDispatcher("Registration22");
                   rd.include(request, response);
//               response.setContentType("text/html");
//               out.println("<h2><font color='red'>Registration not successfull</font><h2>");
              }
                 }
           }else{
                   out.println("Invalid Phone number");
                   RequestDispatcher rd=request.getRequestDispatcher("Registration22");
                   rd.include(request, response);
//               response.setContentType("text/html");
//               out.println("<h2><font color='red'>Invalid phone number</font></h2>");
           }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationTask22.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationTask22.class.getName()).log(Level.SEVERE, null, ex);
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
     
     @Override
    public void destroy(){}
    
    
}
