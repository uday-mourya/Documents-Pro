
package com.user.controller;

import com.user.model.CartDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;


public class AddToCart extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             ArrayList<CartDAO> cartList = new ArrayList<>();
             int id = Integer.parseInt(request.getParameter("id"));
             CartDAO cdao=new CartDAO();
             cdao.setId(id);
             cdao.setQuantity(1);
             HttpSession session= request.getSession();
             ArrayList<CartDAO> cart_list = (ArrayList<CartDAO>) session.getAttribute("cart-list");
             if(cart_list==null){
                cartList.add(cdao);
                session.setAttribute("cart-list", cartList);
                response.sendRedirect("index.jsp");
             }else{
                 cartList = cart_list; 
                  boolean exist = false;
                  for (CartDAO c : cart_list) {
                    if (c.getId() == id) {
                        exist = true;
                        out.println("<h3 style='color:crimson; text-align: center'>Item Already in Cart. <a href='Cart.jsp'>GO to Cart Page</a></h3>");
                    }
                }
                if (!exist) {
                    cartList.add(cdao);
                    response.sendRedirect("index.jsp");
                }
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
