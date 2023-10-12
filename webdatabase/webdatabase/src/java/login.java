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

/**
 *
 * @author dell
 */
public class login extends HttpServlet {

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
            out.println("<title>Servlet login</title>");     
            out.println("<style>");
                out.println("*{");
                out.print("border-radius:20px;");
                out.println("color:");
                out.println("}");
                 out.println("#btn{");
                out.print("width:150px;");
                out.print("height:30px;");
                out.println("background-color:red");
                out.println("color:green");
                out.println("}");
                 out.println("</style>");
            out.println("</head>");
            out.println("<body background='back.jpg'>");
                 out.println("<form action='LoginTask'>");
                    out.println("<table align='center' border='1' cellspacing='1' height='350px' width='400px' bgcolor='goldenroad'>");
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
                        out.print("<input id='btn' type='submit' name='op' value='Login' width='50px'>");
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
