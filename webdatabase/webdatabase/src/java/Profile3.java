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
import java.sql.ResultSet;
/**
 *
 * @author dell
 */
public class Profile3 extends HttpServlet {

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
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Server","root","udaysql@350");
     
                HttpSession session=request.getSession();  
                ResultSet rs1=(ResultSet)session.getAttribute("rs");
                 
                session.setAttribute("name",rs1.getString("Email"));
                           
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
            out.print("<form action='  '>");
            out.print("<table align='center'  cellspacing='0' height='300px' width='600px'>");
            
              out.print("<center>");
               out.print("<h1>");
                    out.print("--Profile--");
                    out.print(rs1.getString(1));
               out.print("</h1>");
              out.print("</center>");
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Your Name");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='text' name='name' readonly value='" + rs1.getString(1) + "'>");
                    out.print("</td>");
                    out.print("<td align='center'>");
                       out.print("<input id='btn' type='submit' readonly name='Profileop' value='NameEdit' width='50px'>");
                    out.print("</td>");
                out.print("</tr>");  
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Father Name");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='text' name='fname' readonly  value='" + rs1.getString(2) + "'>");
                    out.print("</td>");
                     out.print("<td align='center'>");
                       out.print("<input id='btn' type='submit' readonly  name='Profileop' value='FnameEdit' width='50px'>");
                    out.print("</td>");
                out.print("</tr>"); 
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Your Email");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='email' name='email' readonly   value='" + rs1.getString(3) + "'>");
                    out.print("</td>");
                     out.print("<td align='center'>");
                       out.print("<input id='btn' type='submit' name='Profileop' value='EmailEdit' width='50px'>");
                    out.print("</td>");
                out.print("</tr>"); 
                out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Password");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='password' name='pass' readonly  value='" + rs1.getString(4) + "'>");
                    out.print("</td>");
                     out.print("<td align='center'>");
                       out.print("<input id='btn' type='submit' name='Profileop' value='PasswordEdit' width='50px'>");
                    out.print("</td>");
                out.print("</tr>"); 
                    out.print("<td align='center'>");
                        out.print("Mobile Number");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='tel' name='mobno' readonly  value='" + rs1.getString(5) + "'>");
                    out.print("</td>");
                     out.print("<td align='center'>");
                       out.print("<input id='btn' type='submit' name='Profileop' value='MobileEdit' width='50px'>");
                    out.print("</td>");
                out.print("</tr>"); 
            out.print("</table>");
            out.print("<form>");
            out.println("</body>");
            out.println("</html>");
            
             String name=request.getParameter("name");
             
              String fname=request.getParameter("fname");
              String email=request.getParameter("email");
              String pass=request.getParameter("pass");
              String mobile=request.getParameter("mobno");
              
              
            String edit=request.getParameter("Profileop");
            
            if(edit.equals("NameEdit")){
                
                  out.print("<table align='center' border='1' cellspacing='0'  height='200px' width='600px' bgcolor='goldenroad'>");
                   out.print("<tr>");
                    out.print("<td align='center'>");
                        out.print("Your Name");
                    out.print("</td>");
                    out.print("<td align='center'>");
                        out.print("<input type='text' name='name' value='" + rs1.getString(1) + "'>");
                    out.print("</td>");
                     out.print("<td align='center'>");
                       out.print("<a href='Update'> Edit</a?");
                    out.print("</td>");
                out.print("</tr>"); 
//                  result=a+b;
              }
//              else if(edit.equals("S"))
//              {
////                result=a-b;
//              }
//               else if(edit.equals("Multiplication"))
//              {
////                result=a*b;
//              }
//               else if(edit.equals("Division"))
//              {
////                result=a/b;
//              }
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
