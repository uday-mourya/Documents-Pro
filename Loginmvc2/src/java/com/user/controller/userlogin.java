/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user.controller;
import com.user.model.userDAO;
import com.user.model.userDTO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
/**
 *
 * @author hp
 */
public class userlogin extends HttpServlet {

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
        response.setHeader("Cache-Control", "no-cache, no-store");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String email = request.getParameter("email");
            String password=request.getParameter("password");
//            
//            if (email == null || password == null || email.isEmpty() || password.isEmpty()) {
//            response.sendRedirect("Login2.jsp"); // Redirect if email or password is missing
//            return;
//        }
                        
            userDAO edao=new userDAO();
            edao.setEmail(email);
            edao.setPassword(password);
            userDTO udto=new userDTO();
            boolean b=udto.login(edao);
            if(b)
            {
                
                HttpSession session = request.getSession();
                session.setAttribute("id", edao.getId());
                session.setAttribute("name", edao.getName());
                session.setAttribute("fname", edao.getFname());
                session.setAttribute("email", edao.getEmail());
                session.setAttribute("pass", edao.getPassword());
                session.setAttribute("mobile",edao.getMobile());
                session.setAttribute("address",edao.getAddress());
                session.setAttribute("udao",edao);
                response.sendRedirect("dashboard222.jsp");
            }
            else {
                out.print(" \"This User Not exists\"");
                    RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
                    rd.include(request, response);
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
