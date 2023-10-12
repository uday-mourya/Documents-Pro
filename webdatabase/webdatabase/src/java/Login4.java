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
public class Login4 extends HttpServlet {

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
            out.println("<html lang='en' >");
            out.println("<head>");
            out.println("  <meta charset='UTF-8'>");
            out.println("  <title>Login Page</title>");
            out.println("  <link rel='stylesheet' href='login.css'>");
            out.println("");
            out.println("<style>");

            out.println(".login-page {");
            out.println("  width: 360px;");
            out.println("  padding: 8% 0 0;");
            out.println("  margin: auto;");
            out.println("}");
            out.println(".form {");
            out.println("  position: relative;");
            out.println("  z-index: 1;");
            out.println("  background: #FFFFFF;");
            out.println("  max-width: 360px;");
            out.println("  border-radius:20px;");
            out.println("  max-height: 360px;");
            out.println("  height:250px;");
            out.println("  margin: 0 auto 100px;");
            out.println("  padding: 45px;");
            out.println("  text-align: center;");
            out.println("  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);");
            out.println("}");
            out.println(".form input {");
            out.println("  font-family: 'Roboto', sans-serif;");
            out.println("  outline: 0;");
            out.println("  background: #f2f2f2;");
            out.println("  width: 100%;");
            out.println("  border: 0;");
            out.println("  margin: 0 0 15px;");
            out.println("  padding: 15px;");
            out.println("  box-sizing: border-box;");
            out.println("  font-size: 14px;");
            out.println("}");
            out.println(".form button {");
            out.println("  font-family: 'Roboto', sans-serif;");
            out.println("  text-transform: uppercase;");
            out.println("  outline: 0;");
            out.println("  background: #4CAF50;");
            out.println("  width: 100%;");
            out.println("  border: 0;");
            out.println("  padding: 15px;");
            out.println("  color: #FFFFFF;");
            out.println("  font-size: 14px;");
            out.println("  -webkit-transition: all 0.2 ease;");
            out.println("  transition: all 0.2 ease;");
            out.println("  cursor: pointer;");
            out.println("}");
            out.println(".form button:hover,.form button:active,.form button:focus {");
            out.println("  background: #43A047;");
            out.println("}");
            out.println(".form .message {");
            out.println("  margin: 15px 0 0;");
            out.println("  color: #b3b3b3;");
            out.println("  font-size: 16px;");
            out.println("}");
            out.println(".form .message a {");
            out.println("  color: #4CAF50;");
            out.println("  text-decoration: none;");
            out.println("}");
            out.println(".form .register-form {");
            out.println("  display: none;");
            out.println("}");
            out.println(".container {");
            out.println("  position: relative;");
            out.println("  z-index: 1;");
            out.println("  max-width: 300px;");
            out.println("  margin: 0 auto;");
            out.println("}");
            out.println(".container:before, .container:after {");
            out.println("  content: ");
            out.println("  display: block;");
            out.println("  clear: both;");
            out.println("}");
            out.println(".container .info {");
            out.println("  margin: 50px auto;");
            out.println("  text-align: center;");
            out.println("}");
            out.println(".container .info h1 {");
            out.println("  margin: 0 0 15px;");
            out.println("  padding: 0;");
            out.println("  font-size: 36px;");
            out.println("  font-weight: 300;");
            out.println("  color: #1a1a1a;");
            out.println("}");
            out.println(".container .info span {");
            out.println("  color: #4d4d4d;");
            out.println("  font-size: 12px;");
            out.println("}");
            out.println(".container .info span a {");
            out.println("  color: #000000;");
            out.println("  text-decoration: none;");
            out.println("}");
            out.println(".container .info span .fa {");
            out.println("  color: #EF3B3A;");
            out.println("}");
//            out.println("body {");
//            out.println("  background: #76b852; /* fallback for old browsers */");
//            out.println("  background: -webkit-linear-gradient(right, #76b852, #8DC26F);");
//            out.println("  background: -moz-linear-gradient(right, #76b852, #8DC26F);");
//            out.println("  background: -o-linear-gradient(right, #76b852, #8DC26F);");
//            out.println("  background: linear-gradient(to left, #76b852, #8DC26F);");
//            out.println("  font-family: 'Roboto', sans-serif;");
//            out.println("  -webkit-font-smoothing: antialiased;");
//            out.println("  -moz-osx-font-smoothing: grayscale; ");
//            out.println("}");
             
                out.print("body{");
out.print("    margin: 0;");
out.print("    padding: 0;");
out.print("    font-family: Roboto;");
out.print("    background-repeat: no-repeat;");
out.print("    background-size: cover;");
//out.print("    background: linear-gradient(120deg, #007bff, #d0314c);");
out.print("    background-color:green");
out.print("    height: 100vh;");
out.print("    overflow: hidden;");
out.print(" }"); 
            

            out.println("</style>");
            out.println("</head>");

            out.println("<body>");
            out.println("<!-- partial:index.partial.html -->");
            out.println("<div class='login-page'>");
            out.println("  <div class='form'>");
            out.println("    <form class='register-form'>");
            out.println("      <input type='text' placeholder='name'/>");
            out.println("      <input type='password' placeholder='password'/>");
            out.println("      <input type='text' placeholder='email address'/>");
            out.println("      <button>create</button>");
            out.println("      <p class='message'>Already registered? <a href='#'>Sign In</a></p>");
            out.println("    </form>");
            out.println("    <form class='login-form' action='LoginTask2'>");
            out.println("      <input type='text' name='email' placeholder='Email'/>");
            out.println("      <input type='password' name='pass' placeholder='password'/>");
            out.println("      <button>login</button>");
            out.println("      <p class='message'>Not registered? <a href='Registration22'>Create an account</a></p>");
            out.println("    </form>");
            out.println("  </div>");
            out.println("</div>");
            out.println("<!-- partial -->");
            out.println("  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script><script  src='./script.js'></script");
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
