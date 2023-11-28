<%-- 
    Document   : Dashboard
    Created on : Nov 4, 2023, 2:30:42 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
<head>
  <title>Servlet Dashboard</title>
  <style>
    /* Your CSS styles */
     * {
      margin: 0;
      padding: 0;
    }

    #container {
      height: 620px;
      width: 100%;
      margin: auto;
      background-color: #9AE5FC ;
/*      background: linear-gradient(120deg, #007bff, #d0314c);*/
    }

    #header {
      height: 60px;
      width: 100%;
      background-color: white;
    }

    h1 {
      padding-top: 10px;
    }

    #nav {
      height: 50px;
      width: 100%;
      background-color: black !important;
      padding-top: 30px;
    }

    #nav ul li {
      list-style: none;
      display: inline;
      font-size: 20px;
    }

    #nav ul li a {
      text-decoration: none;
      color: white;
      margin-left: 120px;
      margin-top: 50px;
      text-align: center;
    }

    #nav ul li a:hover {
      color: #00FF00jjj;
    }
  </style>
</head>
<body>
<%
    // Retrieve the user's name from the session
    response.setHeader("Cache-Control", "no-cache, no-store");
            response.setHeader("Pragma", "no-cache");
            
            String email = (String) session.getAttribute("email");
            String name = (String) session.getAttribute("name");
            String mobile = (String) session.getAttribute("mobile");
             
            if(email==null){
                response.sendRedirect("UserLogin.jsp");
                System.out.println(email);
            }
%>
<div id="container">
    <div id="header">
        <center><h1>WELCOME <%= name %></h1></center>
    </div>  
    <div id='nav'>
        <ul>
            <li><a href='UserDashboard.jsp'>Home</a></li>
            <li><a href='UserDashboard.jsp'>About Us</a></li>
            <li><a href='UserDashboard.jsp'>Gallery</a></li>
            <li><a href='Userprofile.jsp'>Profile</a></li>
            <li><a href='Userpassupdate.jsp'>Update Password</a></li>
            <li><a href='UserLogout'>Logout</a></li> <!-- Corrected Logout link -->
        </ul>
    </div>
    
    
</div>
</body>
</html>
