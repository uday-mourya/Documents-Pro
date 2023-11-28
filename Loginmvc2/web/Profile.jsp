<%-- 
    Document   : Profile
    Created on : Nov 8, 2023, 7:41:46 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import = "java.io.*,java.util.*" %>
<%
            int id = (int) session.getAttribute("id");
            String name = (String) session.getAttribute("name");
            String email = (String) session.getAttribute("email");
            String pass = (String) session.getAttribute("pass");
            String mobile = (String) session.getAttribute("mobile");
            String salary = (String) session.getAttribute("salary");  
           
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <style>
            body {
                background: #BA68C8;
            }

            .form-control:focus {
                box-shadow: none;
                border-color: #BA68C8;
            }

            .profile-button {
                background: #BA68C8;
                box-shadow: none;
                border: none;
            }

            .profile-button:hover {
                background: #682773;
            }

            .profile-button:focus {
                background: #682773;
                box-shadow: none;
            }

            .profile-button:active {
                background: #682773;
                box-shadow: none;
            }

            .back:hover {
                color: #682773;
                cursor: pointer;
            }
        </style>
        <script>

            function confirmEdit() {
                return confirm("Are you sure you want to edit Password");
            }
            function confirmEdit2() {
                return confirm("Are you sure you want to edit this record?");
            }

        </script>

    </head>
    <body>
        <div class="container rounded bg-white mt-5">
            <div class="row">
                <div class="col-md-4 border-right">
                    <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" src="https://i.imgur.com/0eg0aG0.jpg" width="90"><span class="font-weight-bold">  <%= name %></span><span class="text-black-50"> <%= email %></span><span>Indore</span></div>
                </div>
                <div class="col-md-6">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center mb-3">
                            <div class="d-flex flex-row align-items-center back"><i class="fa fa-long-arrow-left mr-1 mb-1"></i>
                                <a href="Dashboard.jsp" ><h6>Back to home</h6></a>
                            </div>

                        </div>
                        <div class="row mt-2">
                            <div class="col-md-3">Your Name</div>
                            <div class="col-md-6"><input type="text" class="form-control"  name="name" readonly value="<%= name %>"></div>
                        </div>

                        <div class="row mt-3">
                            <div class="col-md-3">Email</div>
                            <div class="col-md-6"><input type="text" class="form-control"  name="name" readonly value="<%= email %>"></div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-md-3">Password</div>
                            <div class="col-md-6"><input type="text" class="form-control"  name="name"readonly value="<%= pass %>"></div>

                        </div>
                        <div class="row mt-3">
                            <div class="col-md-3">Mobile</div>
                            <div class="col-md-6"><input type="text" class="form-control"  name="name"readonly value="<%= mobile %>"></div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-md-3">Salary</div>
                            <div class="col-md-6"><input type="text" class="form-control"  name="name"readonly value="<%= salary %>"></div>
                        </div>
                        <!--                    <div class="mt-5 text-right"><button class="btn btn-primary profile-button" type="button">Save Profile</button></div>-->
                        <div class="row mt-5">
                            <div class="col-md-4"><a  onclick="return confirmEdit2();" href="Editprofile.jsp" ><h6>Edit Profile</h6></a></div>
                            <div class="col-md-4"><a  onclick="return confirmEdit();" href="Updatepassword.jsp" ><h6>Update Password</h6></a></div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
