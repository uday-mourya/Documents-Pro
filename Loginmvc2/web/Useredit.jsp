<%-- 
    Document   : Editprofile
    Created on : Nov 8, 2023, 8:02:19 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="jakarta.servlet.http.HttpSession" %>
<%@page import="java.io.IOException" %>
<%
            int id = (int) session.getAttribute("id");
            String name = (String) session.getAttribute("name");
            String fname = (String) session.getAttribute("fname");
            String email = (String) session.getAttribute("email");
            String pass = (String) session.getAttribute("pass");
            String mobile = (String) session.getAttribute("mobile");
            String address = (String) session.getAttribute("address");  
           
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
            #head{
                justify-content: center;
            }
            .form-control:focus {
                box-shadow: none;
                border-color: #BA68C8;
            }
            .form-control{
                align-items: center;
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

            function namevalidate()
            {
                var name = document.getElementById("name");
                var udisplay = document.getElementById("udisplay");
                if (name.value.trim() == "") {
                    udisplay.innerHTML = " Please Enter Name Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(name.value)) {
                        udisplay.innerHTML = "";
                        udisplay.style.color = "Green";
                        return true;
                    } else {
                        udisplay.innerHTML = "Only letters are allowed";
                        udisplay.style.color = "purple";
                        return false;
                    }
                     }
                    }
            function Fvalidate()
            {
                var Fname = document.getElementById("Fname");
                var fdisplay = document.getElementById("fdisplay");
                if (Fname.value.trim() == "") {
                    fdisplay.innerHTML = "Please Enter FatherName Required";
                    fdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(Fname.value)) {
                        fdisplay.innerHTML = "";
                        fdisplay.style.color = "Green";
                        return true;
                    } else {
                        fdisplay.innerHTML = "Only letters are allowed";
                        fdisplay.style.color = "purple";
                        return false;
                    }
                     }
                    }
            function eValidate()
            {
                var name = document.getElementById("email");
                var edisplay = document.getElementById("edisplay");
                if (name.value.trim() == "") {
                    edisplay.innerHTML = "  Please Enter Email Required";
                    edisplay.style.color = "red";

                    return false;
                } else {
                    var reg = /^[0-9A-Za-z]+@[a-z]+\.[a-z]{2,3}$/;
                    if (reg.test(name.value)) {
                        edisplay.innerHTML = "";
                        edisplay.style.color = "green";
                        return true;
                    } else {
                        edisplay.innerHTML = "Invalid email @";
                        edisplay.style.color = "purple";
                        return false;
                    }
                     }
                    }

            function Movalidate()
            {
                var mobile = document.getElementById("mobile");
                var mdisplay = document.getElementById("mdisplay");
                if (mobile.value.trim() == "") {
                    mdisplay.innerHTML = "mobile Required";
                    mdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[6789][0-9]{9}/;
                    if (reg.test(mobile.value)) {
                        mdisplay.innerHTML = "";
                        mdisplay.style.color = "Green";
                        return true;
                    } else {
                        mdisplay.innerHTML = "Number should start with 6, 7, 8, or 9 and have 10 digits";
                        mdisplay.style.color = "purple";
                        return false;
                    }
                     }
                    }

            function confirmEdit() {
                return confirm("Are you sure you want to edit this record?");
            }
            function confirmDelete() {
                return confirm("Are you sure you want to edit this record?");
            }

        </script>

    </head>
    <body>
        <form  action="UserUpdate" method="post">
            <div class="container rounded bg-white mt-5">
                <div id="head" class="row mt-2"><h4 align="center" class="my-3">Edit profile</h4></div>
                <div class="row">
                    <!--            <div class="col-md-4 border-right">
                                    <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" src="https://i.imgur.com/0eg0aG0.jpg" width="90"><span class="font-weight-bold">John Doe</span><span class="text-black-50">john_doe12@bbb.com</span><span>United States</span></div>
                                </div>-->
                    <div class="col-md-8">
                        <div class="p-3 py-3">
                            <div class="d-flex justify-content-between align-items-center mb-3">
                                <div class="d-flex flex-row align-items-center back"><i class="fa fa-long-arrow-left mr-1 mb-1"></i>
                                    <a href="UserDashboard.jsp" ><h6>Back to home</h6></a>
                                </div>

                            </div>
                            <div class="row mt-2">
                                <div class="col-md-3">Your Name</div>
                                <div class="col-md-6"><input  onkeyup="namevalidate()" id="name" type="text" class="form-control"  value="<%= name %>" name="name"></div>
                                <span class="span1" id="udisplay" style="color:red"></span>
                                <!--                        <div class="col-md-6"><input type="text" class="form-control" value="Doe" placeholder="Doe"></div>-->
                            </div>
                            <div class="row mt-3">
                                <div class="col-md-3">Father Name</div>
                                <div class="col-md-6"><input  onkeyup="namevalidate()" id="name" type="text" class="form-control"  value="<%= fname %>" name="fname"></div>
                                <span class="span1" id="udisplay" style="color:red"></span>
                                <!--                        <div class="col-md-6"><input type="text" class="form-control" value="Doe" placeholder="Doe"></div>-->
                            </div>    

                            <div class="row mt-3">
                                <div class="col-md-3">Email</div>
                                <div class="col-md-6"><input onkeyup="eValidate()" id="email" type="text" class="form-control"  value="<%= email %>" name="email" ></div>
                                <span class="span1" id="fdisplay" style="color:red"></span>
                            </div>
                            <div class="row mt-3">
                                <div class="col-md-3">Password</div>
                                <div class="col-md-6"><input type="text" class="form-control"  value="<%= pass %>"  name="pass"></div>
                                <span class="span1" id="edisplay" style="color:red"></span>
                            </div>
                            <div class="row mt-3">
                                <div class="col-md-3">Mobile Number</div>
                                <div class="col-md-6"><input onkeyup="Movalidate()" id="mobile" type="text" class="form-control"  value="<%= mobile %>"  name="mob" maxlength="10"></div>
                                <span class="span1" id="mdisplay" style="color:red"></span>
                            </div>
                            <div class="row mt-3">
                                <div class="col-md-3">Address</div>
                                <div class="col-md-6"><input type="text" class="form-control"  value="<%= address %>"  name="add" maxlength="10"></div>
                                <span class="span1" id="mdisplay" style="color:red"></span>
                            </div>    
                            <div class="mt-5 text-left"><input type="submit" value="Save Profile"></div>
                        </div>
                    </div>
                </div>
            </div>
        </form>

    </body>
</html>