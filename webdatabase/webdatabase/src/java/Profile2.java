/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author dell
 */
public class Profile2 extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             System.out.println("Driver loded");
//             java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Server","root","udaysql@350");
//             System.out.println("Connection succesfully");
//             System.out.println("");
//                HttpSession session=request.getSession();  
//                java.sql.ResultSet rs1=(ResultSet)session.getAttribute("rs");
                
          out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registration</title>");
                out.println("<style>");
                out.println("*{");
                out.print("border-radius:30px;");
                 out.print("background-image:url('back.jpg');");
                 out.println("#btn{");
                out.print("width:150px;");
                out.print("height:30px;");
                out.println("background-color:green");
                out.println("color:green");
                out.println("}");
                out.println("}");
                 
//                btn
             out.println("#btn{");
                out.print("width:150px;");
                out.print("height:30px;");
                out.println("background-color:red");
                out.println("color:green");
                out.println("}");
                
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.print("<form action='registrationmech'>");
            out.print("<table align='center'  cellspacing='0' height='300px' width='600px'>");
            
              out.print("<center>");
               out.print("<h1>");
                    out.print("Profile");
               out.print("</h1>");
              out.print("</center>");
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Enter Your Name");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='text' name='name' required>");
                    out.print("</td>");
                    out.print("<td align='center'>");
                       out.print("<input id='btn' type='submit' name='Profileop' value='Edit' width='50px'>");
                    out.print("</td>");
                out.print("</tr>");  
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Enter Father Name");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='text' name='fname' required>");
                    out.print("</td>");
                out.print("</tr>"); 
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
                    out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Enter Mobile Number");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='tel' name='mobno' required>");
                    out.print("</td>");
                out.print("</tr>"); 
            out.print("</table>");
            out.print("<form>");
            out.println("</body>");
            out.println("</html>");
            
           }
           catch(Exception e){
             out.println(e);
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
