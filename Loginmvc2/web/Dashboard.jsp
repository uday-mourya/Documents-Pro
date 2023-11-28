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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
                margin-left: 110px;
                margin-top: 30px;
                text-align: center;
            }

            #nav ul li a:hover {
                color: #00FF00jjj;
            }
        </style>
        <script>
            function confirmEdit() {
                return confirm("Are you sure you want to edit this record?");
            }

            function passValidate() {
                var pass = document.getElementById("pass");
                var confirmPass = document.getElementById("confirmPass");
                var pdisplay = document.getElementById("pdisplay");

                if (pass.value.trim() === " " || confirmPass.value.trim() === " ") {
                    pdisplay.innerHTML = "Passwords are required";
                    pdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^(?=.+?[0-9])(?=.+[A-Z])(?=.+?[a-z])(?=.+?[~!@#$%^&*()-+]).{8,}$/;
                    if (reg.test(pass.value)) {
                        pdisplay.innerHTML = "Valid";
                        pdisplay.style.color = "green";
                        return true;
                    } else {
                        pdisplay.innerHTML = "Please enter at least one number, uppercase, lowercase, special character, and a minimum of 8 characters";
                        pdisplay.style.color = "red";
                        return false;
                    }
                }
            }


            function passValidate2() {
                var pass = document.getElementById("pass");
                var confirmPass = document.getElementById("confirmPass");
                var pdisplay = document.getElementById("pdisplay");

                if (pass.value.trim() === " " || confirmPass.value.trim() === " ") {
                    pdisplay2.innerHTML = "Passwords are required";
                    pdisplay2.style.color = "red";
                    return false;
                } else if (pass.value !== confirmPass.value) {
                    pdisplay2.innerHTML = "Passwords do not match";
                    pdisplay2.style.color = "red";
                    return false;
                } else {
                    var reg = /^(?=.+?[0-9])(?=.+[A-Z])(?=.+?[a-z])(?=.+?[~!@#$%^&*()-+]).{8,}$/;
                    if (reg.test(pass.value)) {
                        pdisplay2.innerHTML = "Valid";
                        pdisplay2.style.color = "green";
                        return true;
                    } else {
                        pdisplay2.innerHTML = "Please enter at least one number, uppercase, lowercase, special character, and a minimum of 8 characters";
                        pdisplay2.style.color = "red";
                        return false;
                    }
                }
            }

        </script>
    </head>
    <body>
        <%
            // Retrieve the user's name from the session
            response.setHeader("Cache-Control", "no-cache, no-store");
                    response.setHeader("Pragma", "no-cache");
                    
                     int id = (int) session.getAttribute("id");
                    String email = (String) session.getAttribute("email");
                    String name = (String) session.getAttribute("name");
                     String pass = (String) session.getAttribute("pass");
                    String mobile = (String) session.getAttribute("mobile");
                    String salary = (String) session.getAttribute("salary");  
                    if(email==null){
                        response.sendRedirect("Login2.jsp");
                        System.out.println(email);
                    }
        %>
        <div id="container">
            <div id="header">
                <center><h2 class="my-2">Welcome <%= name %></h2></center>
            </div>  
            <div id='nav'>
                <ul>
                    <li><a href='Dashboard.jsp'>Home</a></li>
                    <li><a href='productadd.jsp'>Product ADD</a></li>
                    <li><a href='Dashboard.jsp'>Gallery</a></li>
                    <li><a href='Profile.jsp'>Profile</a></li>
                    <li><a href='' onclick="return confirmEdit();" data-bs-toggle="modal" data-bs-target="#exampleModal" >Update Password</a></li>
                    <li><a href='Logoutcontroller'>Logout</a></li> <!-- Corrected Logout link -->
                </ul>
            </div>
            <!-- Button trigger modal -->

            <!--            <div class="text-center mt-5">
                            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                Update Profile
                            </button>
                        </div>-->

            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">

                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Password Update</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <form id="yourFormId" action="updatepass">

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="name">Enter Old Password</label>
                                    <input type="text" id="oldpass" class="form-control form-control-lg"  name="oldpass" value="" />      
                                    <p id="oldpass" class="error"></p>
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="fname">Enter New Password</label>
                                    <input onkeyup=" passValidate()" id="pass" type="text" class="form-control form-control-lg"  name="newpass" value="" />         
                                    <span id="pdisplay" style="color:red; font-size: 14px;"></span>       
                                </div>

                                <div class="form-outline mb-4">
                                    <label class="form-label" for="email">confirm Password</label>   
                                    <input onkeyup="passValidate2()" id="confirmPass" type="text" class="form-control form-control-lg" name="cpass" value=""/>     
                                    <span id="pdisplay2" style="color:red; font-size: 14px;"></span>

                                </div>   
                                <div class="d-flex justify-content-center">
                                    <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Update</button>
                                </div>
                            </form>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>

                        </div>
                    </div>
                </div>
            </div>

        </div>
    </body>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</html>
