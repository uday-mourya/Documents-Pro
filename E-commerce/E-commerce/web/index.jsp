<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.users.model.*"%>
<%@page import="java.util.*" %>

<%
UserDAO udao = (UserDAO) request.getSession().getAttribute("udao");
if (udao != null) {
    request.setAttribute("person", udao);    
}
EmployeeDAO edao = (EmployeeDAO) request.getSession().getAttribute("edao");
if (edao != null) {
    request.setAttribute("employee", edao);    
}
ProductDTO pdto=new ProductDTO();
List <ProductDAO> products= pdto.getAllProducts();
ArrayList<CartDAO> cart_list = (ArrayList<CartDAO>) session.getAttribute("cart-list");
if (cart_list != null) {
	request.setAttribute("cart_list", cart_list);
}
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
/*            background: linear-gradient(-135deg, #c850c0, #4158d0);*/
        }
        .navbar{
            width:100%;
        }
    </style>
</head>
<body>


<% if(udao!=null){ %>
<center><h4><font color="fff">WELCOME <%=udao.getName().toUpperCase()%></font></h4>
<!--    <h3>Your Email:<%=udao.getEmail()%></h3>-->
    <h3><font color="fff">Customer Id   :<%=udao.getId()%></font></h3></center>

   

<%}
if(edao!=null){%>
    <center><h3><font color="fff">WELCOME <%=edao.getName().toUpperCase()%></font></h3>
<!--    <h3>Your Email:<%=edao.getEmail()%></h3>-->
    <h3><font color="fff">Employee Id   :<%=edao.getId()%></font></h3></center>
<%}
%>
<%@include file="navbar.jsp" %>

<%
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

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>
