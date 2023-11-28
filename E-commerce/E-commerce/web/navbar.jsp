<%-- 
    Document   : navbar
    Created on : 14-Nov-2023, 1:04:16 pm
    Author     : T460
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.users.model.*" %>

<style>
    .navbar{
        position:sticky;
    }
</style>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">LOGO</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Services</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            User
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="Login.jsp">Login</a></li>
            <li><a class="dropdown-item" href="Registration.jsp">Registration</a></li>
        <%  if(udao!=null){  %>   
            <li><a class="dropdown-item" href="UpdatePassword.jsp">Update Password</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="log-out">Logout</a></li>
        <%}%>    
          </ul>
        </li>
                <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Employee
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="EmpLogin.jsp" >Login</a></li>
            <li><a class="dropdown-item" href="EmpRegistration.jsp" >Registration</a></li>
        <%  if(edao!=null){  %>   
            <li><a class="dropdown-item" href="ProductInsert.jsp">Add_Product</a></li>
            <li><a class="dropdown-item" href="EmpUpdatePassword.jsp">Update Password</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="log-out">Logout</a></li>
        <%}%>    
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="#" tabindex="-1" >About Us</a>
        </li>
        <li class="nav-item"><a class="nav-link" href="Cart.jsp">Cart <span class="badge badge-danger">${cart_list.size()}</span> </a></li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>   
</nav>
<!--<button type="button" class="btn btn-success d-table my-5 mx-auto" data-bs-toggle="modal" data-bs-target="#ModalForm">
  Bootstrap Modal Form
</button>-->


<!-- Modal Form -->
<div class="modal fade" id="ModalForm2" tabindex="-1" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
        <!-- Login Form -->
        <form action="">
          <div class="modal-header">
            <h5 class="modal-title">Modal Login Form</h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            <div class="mb-3">
                <label for="Username">Username<span class="text-danger">*</span></label>
                <input type="text" name="username" class="form-control" id="Username" placeholder="Enter Username">
            </div>

            <div class="mb-3">
                <label for="Password">Password<span class="text-danger">*</span></label>
                <input type="password" name="password" class="form-control" id="Password" placeholder="Enter Password">
            </div>
            <div class="mb-3">
                <input class="form-check-input" type="checkbox" value="" id="remember" required>
                <label class="form-check-label" for="remember">Remember Me</label>
                <a href="#" class="float-end">Forgot Password</a>
            </div>
          </div>
          <div class="modal-footer pt-4">                  
            <button type="button" class="btn btn-success mx-auto w-100">Login</button>
          </div>
          <p class="text-center">ALready Have Account, <a href="" data-bs-toggle="modal" data-bs-target="#ModalForm">Login</a></p> 
      </form>
    </div>
  </div>
</div>