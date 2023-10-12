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
public class Registration22 extends HttpServlet {

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
            out.println("<title>Servlet registration</title>");
                out.println("<style>");
                out.println("*{");
                 out.print("border-radius:30px;");
                 out.print("background-image:url('back.jpg');");
                  out.println("}");
                 out.println("#btn{");
                out.print("width:150px;");
                out.print("height:30px;");
              out.println("  cursor: pointer;");
            out.println("  font-family: 'Roboto', sans-serif;");
            out.println("  text-transform: uppercase;");
            out.println("  outline: 0;");
            out.println("  background:#1EEC1B;");
            out.println("  border: 0.3;");
            out.println("  color: #FFFFFF;");
            out.println("  font-size: 14px;");
            out.println("  -webkit-transition: all 0.3 ease;");
            out.println("  transition: all 0.3 ease;");
            out.println("  cursor: pointer;");
             out.println("}");
             out.println("#btn:hover,#btn:active,#btn:focus {");
            out.println("  background: goldenroad;");
                out.println("}");
//                 out.println("body {");
//            out.println("  background: #76b852; /* fallback for old browsers */");
//            out.println("  background: -webkit-linear-gradient(right, #76b852, #8DC26F);");
//            out.println("  background: -moz-linear-gradient(right, #76b852, #8DC26F);");
//            out.println("  background: -o-linear-gradient(right, #76b852, #8DC26F);");
//            out.println("  background: linear-gradient(to left, #76b852, #8DC26F);");
//            out.println("  font-family: 'Roboto', sans-serif;");
//            out.println("  -webkit-font-smoothing: antialiased;");
//            out.println("  -moz-osx-font-smoothing: grayscale; ");
//            out.println("}");

            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.print("<form action='RegistrationTask22' id='form'>");
            out.print("<table align='center' border='1' cellspacing='0'  height='400px' width='600px' bgcolor='goldenroad'>");
            
              out.print("<center>");
               out.print("<h1>");
                    out.print("Sign Up");
               out.print("</h1>");
              out.print("</center>");
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Enter Your Name");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='text' name='name' required>");
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
                out.print("<tr colspan='2'>");
                    out.print("<td align='center' colspan='2'>");
                        out.print("<input type='submit' id='btn' name='op' value='Register'>");
                    out.print("</td>");
                out.print("</tr>"); 
                 out.print("<tr colspan='2'>");
                    out.print("<td align='center' colspan='2'>");
                         out.println("      <p class='message'>Already registered? <a href='Login3'>Log In</a></p>");
                    out.print("</td>");
                out.print("</tr>"); 
            out.print("</table>");
            out.print("<form>");
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
     public void destroy(){};
}
