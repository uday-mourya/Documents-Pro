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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dell
 */
public class Login2 extends HttpServlet {

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
            out.println("<title>Servlet Login2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=''>");
                    out.println("<table align='center' border='1' cellspacing='1' height='350px' width='400px' bgcolor='aqua'>");
                    out.print("<h1 align='center'>");
                        out.print("Log In");
                    out.print("</h1>");
                    out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Enter Your Email");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='email' name='email' required>");
                    out.print("</td>");
                out.print("</tr>"); 
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Enter Password");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='password' name='pass' required>");
                    out.print("</td>");
                out.print("</tr>"); 
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Confirm Password");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='password' name='cpass' required>");
                    out.print("</td>");
                out.print("</tr>");    
                out.print("</tr>"); 
                out.print("<tr colspan='2'>");
                    out.print("<td align='center' colspan='2'>");
                        out.print("<input type='submit' name='op' value='Login'>");
                    out.print("</td>");
                out.print("</tr>");
                 out.print("<tr colspan='2'>");
                    out.print("<td align='center' colspan='2'>");
                        out.print("<a href='registration'>");
                        out.print("New User");
                        out.print("</a>");
                    out.print("</td>");
                out.print("</tr>");
                out.println("</table>");
                 out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
            
            
            
            /*Login Check*/
            String email=request.getParameter("email");
            String pass=request.getParameter("pass");
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/server?useSSL=false", "root", "udaysql@350");
                
                String sql="select * from registration where email=? and password=?";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setString(1, email);
                        ps.setString(2,pass);
                        
                       ResultSet rs = ps.executeQuery();
                        out.println("..");
                        if(rs.next())
                        {
//                          out.print("LOGIN SUCCESSFULL");
                            response.sendRedirect("Dashboard");
                        }
                        else
                        {
                            out.println("This User Not exists");
                        }
            }
            catch( Exception e){
                out.println("Internal Error");
            }
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
