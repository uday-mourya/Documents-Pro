<%-- 
    Document   : dashboard2
    Created on : Nov 20, 2023, 8:49:40 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.employee.model.productDAO" %>
<%@ page import="com.employee.model.productDTO" %>

<%@ page import="com.employee.model.*" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" integrity="sha384-oA5mJj8CGI1iQ+Uq8XqBx5VHdJq2WfNN6X8cJ6Q9rW2IwoGqLO5qH1ADsBRsahdT" crossorigin="anonymous">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">    
        

        <title>User Dashboard</title>
        <style>
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Poppins', sans-serif;
            }
            html,body{
                height: 100%;
                width: 100%;
                place-items: center;
                background: #f2f2f2;
                background-color: aliceblue;
                /* background: linear-gradient(-135deg, #71EE0F, #EE190F); */
            }
            .navbar{
                width:100%;
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
        <% 
            productDAO dao = new productDAO(); 
            productDTO dao1 = new productDTO();
            boolean hasRecords = dao1.allFood(dao);
            ArrayList<ArrayList<String>> al = dao.getAl();
            if (hasRecords) {
                al = dao.getAl();
            }
        %>
        <div id="header">
            <center><h3>WELCOME <%= name %></h3></center>
        </div>
        <div class="navbar navbar-inverse">

            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">

                        <div class="navbar-header">
                            <button class="navbar-toggle" data-target="#mobile_menu" data-toggle="collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                            <a href="#" class="navbar-brand">GROUP.COM</a>
                        </div>

                        <div class="navbar-collapse collapse" id="mobile_menu">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="#">Home</a></li>
                                <li><a href="#" class="dropdown-toggle" data-toggle="dropdown">About Us <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">About One</a></li>
                                        <li><a href="#">About Two</a></li>
                                        <li><a href="#">About Three</a></li>
                                        <li><a href="#">About Four</a></li>
                                        <li><a href="#">About Five</a></li>
                                        <li><a href="#">About Six</a></li>
                                    </ul>
                                </li>
                                <li><a href="#">Welcome</a></li>
                                <li><a href="#">Services</a></li>
                                <li><a href="#">Gallery</a></li>
                                <li><a href="#">Contact Us</a></li>
                            </ul>
                            <ul class="nav navbar-nav">
                                <li>
                                    <form action="" class="navbar-form">
                                        <div class="form-group">
                                            <div class="input-group">
                                                <input type="search" name="search" id="" placeholder="Search Anything Here..." class="form-control">
                                                <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>
                                            </div>
                                        </div>
                                    </form>
                                </li>
                            </ul>

                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="#"><span class="ml-2">Cart</span><span class="glyphicon glyphicon-shopping-cart"></span></a></li>
                                <li><a href="Userprofile.jsp"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
                                <li><a href="UserLogout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                                <!-- <li><a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-log-in"></span> Login / Sign Up <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Login</a></li>
                                        <li><a href="#">Sign Up</a></li>
                                    </ul>
                                </li> -->
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>



        <div class="row my-5">
            <% for (ArrayList<String> record : al) { %>
            <div class="col my-3 p-2 rounded-3 text-center">
                
                <h4 class="text-dark text-center pt-2"><%= record.get(2) %></h4>
                <span class="text-dark text-center"><%= record.get(1) %></span>
                <h4>Price : <span><%= record.get(3) %></span></h4>
                <div class="mt-3 d-flex justify-content-between">
                    <a class="btn btn-success" href="">Add to Cart</a> 
                    <a class="btn btn-primary" href="">Buy Now</a>
                </div>
            </div>
            <% } %>
        </div>
        
        
        
</div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </body>
</html>

