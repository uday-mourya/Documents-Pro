<%-- 
    Document   : UpdatePassword
    Created on : 15-Nov-2023, 12:47:14 am
    Author     : T460
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.users.model.*"%>
<%
UserDAO udao = (UserDAO) request.getSession().getAttribute("udao");
EmployeeDAO edao = (EmployeeDAO) request.getSession().getAttribute("edao");
%>
<!DOCTYPE html>

<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Login Form Design </title>
        <style>
            @import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap');
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Poppins', sans-serif;
            }
            html,body{
                display: grid;
                height: 100%;
                width: 100%;
                place-items: center;
                background: #f2f2f2;
                background-color:aliceblue ;
                /*  background: linear-gradient(-135deg, #c850c0, #4158d0); */
            }
            .navbar{
                width:100%;
            }
            ::selection{
                background: #4158d0;
                color: #fff;
            }
            .wrapper{
                width: 380px;
                background: #fff;
                border-radius: 15px;
                box-shadow: 0px 15px 20px rgba(0,0,0,0.1);
            }
            .wrapper .title{
                font-size: 25px;
                font-weight: 400;
                text-align: center;
                line-height: 70px;
                color: black;
                user-select: none;
                border-radius: 15px 15px 0 0;
                /*  background: linear-gradient(-135deg, #c850c0, #4158d0);*/
            }
            .wrapper form{
                padding: 10px 30px 50px 30px;
            }
            .wrapper form .field{
                height: 50px;
                width: 100%;
                margin-top: 20px;
                position: relative;
            }
            .wrapper form .field input{
                height: 100%;
                width: 100%;
                outline: none;
                font-size: 17px;
                padding-left: 20px;
                border: 1px solid lightgrey;
                /*  border-radius: 25px;*/
                transition: all 0.3s ease;
            }
            .wrapper form .field label{
                position: absolute;
                top: 50%;
                left: 20px;
                color: #999999;
                font-weight: 400;
                font-size: 17px;
                pointer-events: none;
                transform: translateY(-50%);
                transition: all 0.3s ease;
            }
            form .field input:focus ~ label,
            form .field input:valid ~ label{
                top: 0%;
                font-size: 16px;
                color: #4158d0;
                background: #fff;
                transform: translateY(-50%);
            }
            form .content{
                display: flex;
                width: 100%;
                height: 50px;
                font-size: 16px;
                align-items: center;
                justify-content: space-around;
            }
            form .content .checkbox{
                display: flex;
                align-items: center;
                justify-content: center;
            }
            form .content input{
                width: 15px;
                height: 15px;
                background: red;
            }
            form .content label{
                color: #262626;
                user-select: none;
                padding-left: 5px;
            }
            form .content .pass-link{

            }
            form .field input[type="submit"]{
                color: black;
                border: none;
                padding-left: 0;
                margin-top: -10px;
                font-size: 20px;
                font-weight: 500;
                cursor: pointer;
                background-color: greenyellow;
                /*  background: linear-gradient(-135deg, #c850c0, #4158d0);*/
                transition: all 0.3s ease;
            }
            form .field input[type="submit"]:active{
                transform: scale(0.95);
            }
            form .signup-link{
                color: #262626;
                margin-top: 20px;
                text-align: center;
            }
            form .pass-link a,
            form .signup-link a{
                color: #4158d0;
                text-decoration: none;
            }
            form .pass-link a:hover,
            form .signup-link a:hover{
                text-decoration: underline;
            }
        </style>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"  %>

        <div class="wrapper">
            <div class="title">
                Update Password
            </div>
            <form action="PasswordUpdate" >
                <div class="field">
                    <input type="password" name="oldpassword" required>
                    <label>Old Password</label>
                </div>
                <div class="field">
                    <input type="password" name="newpassword" required>
                    <label>New Password</label>
                </div> 
                <div class="field">
                    <input type="password" name="confirmpassword" required>
                    <label>Confirm Password</label>
                </div>
                <div class="content">
                    <div class="checkbox">
                        <input type="checkbox" id="remember-me">
                        <label for="remember-me">Remember me</label>
                    </div>
                </div>
                <div class="field">
                    <input type="submit" value="Login">
                </div>
            </form>
        </div>

    </body>
</html>
