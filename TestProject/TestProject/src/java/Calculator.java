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
public class Calculator extends HttpServlet {

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
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Calculator</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Calculator at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
                

             out.print("<form action='Calcmech'>");
             out.print("<table align='center' bgcolor='dodgerblue'>");
             out.print("<tr>");
             out.print("<td>");
             out.print("Enter First Number ");
             out.print("</td>");
             out.print("<td>");
             out.print("<input type='text' name='n1'>");
             out.print("</td>");
             out.print("</tr>");
             out.print("<tr>");
             out.print("<td>");
             out.print("Enter Second Number ");
             out.print("</td>");
             out.print("<td>");
             out.print("<input type='text' name='n2'>");
             out.print("</td>");
             out.print("</tr>");
             out.print("<tr>");
             out.print("<td>");
             out.print("<input type='submit'name='op' value='Addition'>");
             out.print("<input type='submit' name='op' value='Substraction'>");
             out.print("</td>");
             out.print("<td>");
             out.print("<input type='submit' name='op' value='Multiplication'>");
             out.print("<input type='submit' name='op' value='Division'>");
             out.print("</td>");
             out.print("</tr>");
             out.print("<tr>");
              out.print("<td>");
             out.print("<input type='reset' name='op' value='Clear'");
              out.print("</td>");
              out.print("</tr>");
             out.print("</table>");
             out.print("</form>");
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
