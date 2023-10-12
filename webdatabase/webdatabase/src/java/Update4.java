import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Update3")
public class Update4 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            Object id=session.getAttribute("id");
            
//            Object id=session.getAttribute("UserId");
//            Object id = session.getAttribute("UserId");
             
//       out.print("UserID"+id);
            
            String name = request.getParameter("name");
            String fname = request.getParameter("fname");
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            String contact = request.getParameter("mobno");

            Connection con = null;
            try {   
           Class.forName("com.mysql.cj.jdbc.Driver");
          con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
             String sql1="update reginfo set Name=?,Fname=?,Email=?,Password=?,Contact=? where UserId=?";
             PreparedStatement ps = con.prepareStatement(sql1);
             ps = con.prepareStatement(sql1);
              ps.setString(1, name);
              ps.setString(2,fname);
              ps.setString(3, email);
              ps.setString(4, pass);
              ps.setString(5,contact);
              ps.setString(6, (String)id);
              int count=ps.executeUpdate();
              
              if(count>0)
              {
                     response.setContentType("text/html");
                     out.println("<h4><font color='green'>Update successful</font></h4>");
//                     response.sendRedirect("Dashboard");
              }
              else
              {
               response.setContentType("text/html");
               out.println("<h2><font color='red'>Update Failed</font><h2>");
              }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Update3.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (con != null) {
                    con.close();
                }
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Update3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Update3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Update3 Servlet";
    }
}
