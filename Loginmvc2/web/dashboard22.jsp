<%-- 
    Document   : Dashboard
    Created on : Oct 25, 2023, 2:41:20 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
  <title>Servlet Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
  <style>
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
      padding-top: 10px;
    }

    #nav ul li {
      list-style: none;
      display: inline;
      font-size: 20px;
    }

    #nav ul li a {
      text-decoration: none;
      color: white;
      margin-left: 100px;
      margin-top: 50px;
      text-align: center;
    }

    #nav ul li a:hover {
      color: #00FF00jjj;
    }
  </style>
</head>

<body>
    <div  id="container">
     <div id="header">
            <center><h3>WELCOME </h3></center>
        </div>  
    <div id='nav'>
      <ul>
        <li><a href='Dashboard.jsp'>Home</a></li>
            <li><a href='Dashboard.jsp'>About Us</a></li>
            <li><a href='Dashboard.jsp'>Gallery</a></li>
            <li><a href='Profile.jsp'>Profile</a></li>
            <li><a href='Updatepassword.jsp'>Update Password</a></li>
            <li><a href='Logoutcontroller'>Logout</a></li> <!-- Corrected Logout link -->
      </ul>
    </div>
          <div class="row mx-5 my-5">
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">See All record</h5>
        <a href="AllRecord2.jsp" class="btn btn-primary">Go</a>
      </div>
    </div>
  </div>
             
</div>
  </div>
      
</body>
</html>
