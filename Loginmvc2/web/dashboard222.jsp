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
<%@page import="com.user.model.*"%>
<%@page import="java.util.*" %>

<%
userDAO udao = (userDAO) request.getSession().getAttribute("udao");
if (udao != null) {
    request.setAttribute("person", udao);    
}
employeeDAO edao = (employeeDAO) request.getSession().getAttribute("edao");
if (edao != null) {
    request.setAttribute("employee", edao);    
}
productDTO pdto=new productDTO();
List <productDAO> products= pdto.getAllProducts();
ArrayList<CartDAO> cart_list = (ArrayList<CartDAO>) session.getAttribute("cart-list");
if (cart_list != null) {
	request.setAttribute("cart_list", cart_list);
}
%>
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




<% if(udao!=null){ %>
<center><h3><font color="fff">WELCOME <%=udao.getName().toUpperCase()%></font></h3>
<!--    <h3>Your Email:<%=udao.getEmail()%></h3>-->
    <h3><font color="fff">Customer Id   :<%=udao.getId()%></font></h3></center>
   
<%}
if(edao!=null){%>
    <center><h3><font color="fff">WELCOME <%=edao.getName().toUpperCase()%></font></h3>
<!--    <h3>Your Email:<%=edao.getEmail()%></h3>-->
    <h3><font color="fff">Employee Id   :<%=edao.getId()%></font></h3></center>
<%}    
if (!products.isEmpty()) {
%>
<br><br>
<div class="container">
    <div class="row row-cols-1 row-cols-md-4 mt-5 g-4">
        <% for (ProductDAO p : products) { %>
        <div class="col">  
            <div class="card">
                <img src="images/<%=p.getImage()%>" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title"><%=p.getName() %></h5>
                    <h5 class="card-title">Price: $<%=p.getPrice() %></h5>
                    <h5 class="card-title">Category: <%=p.getCategory()%></h5>
                    <div class="mt-3 d-flex justify-content-between">
			<a class="btn btn-success" href="AddToCart?id=<%=p.getId()%>">Add to Cart</a> 
                        <a class="btn btn-primary" href="order-now?quantity=1&id=<%=p.getId()%>">Buy Now</a>
		    </div>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>
<%
} else {
%>
    <h1>There is no products</h1>
<%
}
%>

        
        
        
</div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </body>
</html>

