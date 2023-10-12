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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class profiles extends HttpServlet {

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
            
         
              HttpSession session=request.getSession();
              
              Object i =session.getAttribute("email");
//              out.println("Devendra : "+i);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
            String sql="select * from registration  where email=?";
              PreparedStatement ps = con.prepareStatement(sql);
              ps.setString(1, (String) i);
             
           String name=null;
           String fname =null;
           String pass = null;
           String contact = null;
           String email = null;
              ResultSet rs=ps.executeQuery();
 
              if(rs.next())
              {
                  email= rs.getString("Email");
                  name  = rs.getString("name");
                  fname = rs.getString("fname");
                  pass = rs.getString("Password");
                  contact = rs.getString("Mobile");
                  
              }
              session.setAttribute("email", i);
            out.println("<!DOCTYPE html>");

out.println("<style>");

 out.println("*{");
            out.println("    margin:0;");
            out.println("    padding:0;");
            out.println("}");
            out.println("#container{");
            out.println("    height:620px;");
            out.println("    width:100%;");
            out.println("    margin:auto;");
            out.println(" background: linear-gradient(120deg, #007bff, #d0314c);");
            out.println("}");
            out.println("#header{");
            out.println("    height:60px;");
            out.println("    width:100%;");
            out.println("    background-color: white;");
            out.println("}");
            out.println("h1{");
            out.println("    padding-top:10px;");
            out.println("}");
            out.println("#nav{");
            out.println("    height:50px;");
            out.println("    width:100%;");
            out.println("    background-color:black !important;");
            out.println("    padding-top:30px;");
            out.println("}");
            out.println("#nav ul li{");
            out.println("    list-style:none;");
            out.println("    display:inline;");

            out.println("    font-size:20px;");
            out.println("}");
            out.println("#nav ul li a{");
            out.println("    text-decoration:none;");
            out.println("    color:white;");
            out.println("    margin-left:150px;");
            out.println("    margin-top:50px;");
            out.println("   text-align:center;");
            out.println("}");
            out.println("#nav ul li a:hover{");
            out.println("    color:#00FF00jjj;");
            out.println("}");

//shshsh
out.println("   *{");
out.println("    margin: 0;");
out.println("    padding: 0;");
out.println("    box-sizing: border-box;");
out.println("}");
out.println("#container{");
out.println("    width: 100%;");
out.println("    min-height: 100vh;");
out.println("  ");
out.println("}");


out.println("#content{");
out.println("    width: 100%;");
out.println("    min-height: 500px;");
out.println("    ");
out.println("}");
out.println("#content h3{");
out.println("    margin-top: 20px;");
out.println("    margin-left: 47%;");
out.println("}");
out.println("#table{");
out.println("    width: 100%;");
out.println("    height: 500px;");
out.println("    border: 4px solid  white;");
out.println("}");
out.println("#info{");
out.println("    float: left;");
out.println("    width: 40%;");
out.println("    height: 80%;");
out.println("    margin-top: 40px;");
out.println("    margin-left: 60px;");
out.println("    border-radius: 15px;");
out.println("    border: 2.5px solid white;");
out.println("}");
out.println("#content label{");
out.println("    margin-top: 20px;");
out.println("    margin-left: 5px;");
out.println("    color:black;");
out.println("    border-radius: 25px;");
out.println("    background-color: lightgreen;");
out.println("   ");
out.println("    width: 180px;");
out.println("    padding-left: 20px;");
out.println("    position: absolute;");
out.println("    left: 250px;");
out.println("    top: 440px;");
out.println("    bottom: 15px;");
out.println("    background-color: #0077B6;");
out.println("    color: white;");
out.println("    height: 30px;");
out.println("    padding-top: 5px;");
out.println("}");
out.println("#info table{");
out.println("    width: 70%;");
out.println("    margin-left: 80px;");
out.println("    margin-top: 40px;");
out.println("}");
out.println("#info table tr{");
out.println("    height: 50px;");
out.println("}");
out.println("");
out.println("#up{");
out.println("    width: 80px;");
out.println("    height: 30px;");
out.println("    background-color: transparent;");
out.println("    border-radius:5px;");
out.println("    border-color:gray ;");
out.println("}");
out.println("#update{");
out.println("    float: left;");
out.println("    width: 40%;");
out.println("    height: 80%;");
out.println("    margin-top: 40px;");
out.println("    margin-left: 60px;");
out.println("    border-radius: 25px;");
out.println("    border: 2.5px solid white;");
out.println("    display: none;");
out.println("}");
out.println("#update input{");
out.println("    margin-left: 170px;");
out.println("    margin-top: 25px;");
out.println("    width: 250px;");
out.println("    height: 30px;");
out.println("    border-radius: 25px;");
out.println("    border: none;");
out.println("    border-bottom: 1px solid black;");
out.println("  ");
out.println("}");
out.println("#sub{");
out.println("    font-size: 1.3rem;");
out.println("}");
out.println("#update input:nth-child(6):hover{");
out.println("    background-color: dodgerblue;");
out.println("}");
out.println("");
out.println("#detail:checked~#update{");
out.println("    display: block;");
out.println("}");
out.println("#detail{");
out.println("    display: none;");
out.println("}");

//hahah
           
out.println("</style>");
out.println("<body>");
out.println("<div id=\"container\">");
            
            out.println("<div id='header'>");
            out.println("<div id='nav'>");
            out.println("<ul>");
            out.println("<li><a  href='Dashboard'>Home</a></li>");
            out.println("<li><a  href='Dashboard'>About Us</a></li>");
            out.println("<li><a  href='Dashboard'>Gallery</a></li>");
//            out.println("<td>"+"<a href='Editor?Email="+rs.getString("Email")+"'>Edit</a>"+"</td>");
            out.println("<li><a href='Profile3'>Profile</a></li>");
            out.println("<li><span><a href='Logout'>Logout</a><span></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");

out.println("    <div id=\"content\">");
out.println("        <h3>Your Profile</h3>");
out.println("        <label for=\"detail\">Update Your Details</label>");
out.println("        <div id=\"table\">");
out.println("            <div id=\"info\">");
out.println("                <table>");
out.println("                    <tr>");
out.println("                        <td align=\"center\">Id</td>");
out.println("                        <td align=\"center\">"+email+"</td>");
out.println("                    </tr>");
out.println("                    <tr>");
out.println("                        <td align=\"center\">Name</td>");
out.println("                        <td align=\"center\">"+name+"</td>");
out.println("                    </tr>");
out.println("                    <tr>");
out.println("                        <td align=\"center\">Father Name</td>");
out.println("                        <td align=\"center\">"+fname+"</td>");
out.println("                    </tr>");

out.println("                    <tr>");
out.println("                        <td align=\"center\">password</td>");
out.println("                        <td align=\"center\">"+pass+"</td>");
out.println("                    </tr>");
out.println("                    <tr>");
out.println("                        <td align=\"center\">contact</td>");
out.println("                        <td align=\"center\">"+contact+"</td>");
out.println("                    </tr>");
out.println("                </table>");
out.println("            </div>");
out.println("            <input type=\"checkbox\" name=\"\" id=\"detail\">");

out.println("            <div id=\"update\">");
out.println("           <form action='DataUpdate'>");
out.println("<h2>"+email+"</h2>");
out.println("                <input type=\"text\" placeholder=\"Enter Your new name\" required name=\"newname\" value="+name+" required>");
out.println("                <input type=\"text\" placeholder=\"Enter Father new name\" name=\"newfname\" value="+fname+" required> ");
//out.println("                <input type=\"text\" placeholder='"+email+"' name=\"newemail\" disable value="+email+" required>");
out.println("                <input type=\"text\" placeholder=\"Enter Your new password\" name=\"newpass\" value="+pass+" required>");
out.println("                <input type=\"text\" placeholder=\"Enter Your new contact\" name=\"newcontact\" value="+contact+" required>");
out.println("                <input type=\"submit\" value=\"Submit\" name=\"newsubmit\" id=\"sub\">");
out.println("           </form>");
out.println("            </div>");
out.println("        </div>");
out.println("    </div>");

out.println("</div>");
out.println("</div>");
out.println("    ");
out.println("</body>");
out.println("</html>");
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (SQLException ex) {
            
            System.out.println(ex);
//            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
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
