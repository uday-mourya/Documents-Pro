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
import java.sql.SQLException;
/**
 *
 * @author hp
 */
public class Profile extends HttpServlet {

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
             System.out.println("Driver loded");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Server","root","udaysql@350");
             System.out.println("Connection succesfully");
             System.out.println("");
                HttpSession session=request.getSession();  
                java.sql.ResultSet rs1=(ResultSet)session.getAttribute("rs");
//                String username = (String)session.getAttribute("userid");
//                String email = (String)session.getAttribute("email");
//                String dob = (String)session.getAttribute("dob");
//                String password =(String) session.getAttribute("password");
//                String  mobile = (String)session.getAttribute(" mobile");
        out.print("<!--  -->");
        out.print("<!DOCTYPE html>");
        out.print("<html lang='en'>");
        out.print("<head>");
        out.print("    <meta charset='UTF-8'>");
        out.print("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.print("    <title>Profile</title>");
        out.print("    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css' integrity='sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==' crossorigin='anonymous' referrerpolicy='no-referrer' />");
        out.print("    <link href='https://fonts.googleapis.com/css?family=Cinzel Decorative' rel='stylesheet'>");
        out.print("    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>");
        out.print("    <link rel='stylesheet' href='css/userprofile.css'>");
        out.print("    <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
        out.print("  <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js'></script>");
        out.print("  <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
        out.print("</head>");
        out.print("<body>");
        out.print("      <section id='userinfo'>");
        out.print("            <div id='container'>");
        out.print("                <div id='userprofilediv'>");
        out.print("                    <center><div id='userimg'></div></center>");
        out.print("                    <center><div id='duser'>"+rs1.getString(1)+"<a href='#'><i class='fas fa-edit' id='editicon' style='color: #000000;'></i></a></div></i></center>");
        out.print("                </div>");
        out.print("                <div id='details'>");
        out.print("                    <div id='myoption' align='center' height='50px'><span id='text1'>User Name :&nbsp;&nbsp;"+rs1.getString(1)+"</span></div>");
        out.print("                    <div id='myoption'  align='center'  height='50px'><span id='text1'>Email-id :&nbsp;&nbsp;"+rs1.getString(3)+"</span></div>");
        out.print("                    <div id='myoption'  align='center'  height='50px'><span id='text1'>Mobile no :&nbsp;&nbsp;"+rs1.getString(5)+"</span></div>");
        out.print("                  <div id='myoption' align='center'  height='50px'><span id='text1'>Password :&nbsp;&nbsp;********</span></div>");
        out.print("                    <center><button id='back'><a href='Dashboard'>Back :</a></button></center>");
        out.print("                </div>");
        out.print("            </div>");
        out.print("        </section>");
        out.print("</body>");
        out.print("</html>");
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
