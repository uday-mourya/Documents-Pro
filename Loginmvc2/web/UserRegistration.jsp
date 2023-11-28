<%-- 
    Document   : Registration
    Created on : Oct 25, 2023, 3:55:06 PM
    Author     : Dell
--%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>uday</title>
  <style>
    @import url("https://fonts.googleapis.com/css2?family=Open+Sans:wght@200;300;400;500;600;700&display=swap");

    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: "Open Sans", sans-serif;
    }

    body {
      display: flex;
      align-items: center;
      justify-content: center;
      min-height: 100vh;
      width: 100%;
      padding: 0 10px;
    }

    body::before {
      content: "";
      position: absolute;
      width: 100%;
      height: 100%;
      background-color: black;
      background-position: center;
      background-size: cover;
    }

    .wrapper {
      width: 400px;
      border-radius: 8px;
      background-color: black;
      padding: 30px;
      text-align: center;
      border: 1px solid rgba(255, 255, 255, 0.5);
      backdrop-filter: blur(9px);
      -webkit-backdrop-filter: blur(9px);
    }

    form {
      display: flex;
      flex-direction: column;
    }

    h2 {
      font-size: 2rem;
      margin-bottom: 20px;
      color: #fff;
    }

    .input-field {
      position: relative;
      border-bottom: 1px solid #ccc;
      margin: 8px 0;
    }

    .input-field label {
      position: absolute;
      top: 50%;
      left: 0;
      transform: translateY(-50%);
      color: #fff;
      font-size: 16px;
      pointer-events: none;
      transition: 0.15s ease;
    }

    .input-field input {
      width: 100%;
      height: 15px;
       margin: 8px 0;
      background: transparent;
      border: none;
      outline: none;
      font-size: 16px;
      color: #fff;
    }

    .input-field input:focus~label,
    .input-field input:valid~label {
      font-size: 0.8rem;
      top: 10px;
      transform: translateY(-120%);
    }

    button {
      background: #fff;
      color: #000;
      font-weight: 600;
      border: none;
      padding: 12px 20px;
      cursor: pointer;
      border-radius: 3px;
      font-size: 16px;
      border: 2px solid transparent;
      transition: 0.3s ease;
    }

    button:hover {
      color: #fff;
      border-color: #yy5577;
      background: rgba(255, 255, 255, 0.15);
    }

    .register {
      text-align: center;
      font-size: 16px;
      margin-top: 10px;
      color: #fff;
    }
  </style>
  <script>
    function validate(){}
        function namevalidate()
        {
            var name= document.getElementById("name");
            var udisplay = document.getElementById("udisplay");
            if(name.value.trim()==""){
                udisplay.innerHTML="Name Required";
                udisplay.style.color="red";
                return false;
            }
            else{
                var reg =/^[A-Z a-z]+$/;
                if(reg.test(name.value)){
                    udisplay.innerHTML="";
                    udisplay.style.color="Green";   
                    return true;
                }
                else{
                   udisplay.innerHTML="Only letters are allowed";
                   udisplay.style.color="red";
                    return false;
                }
            }
        }
function Fvalidate()
        {
            var Fname= document.getElementById("Fname");
            var fdisplay = document.getElementById("fdisplay");
            if(Fname.value.trim()==""){
                fdisplay.innerHTML="FatherName Required";
                fdisplay.style.color="red";
                return false;
            }
            else{
                var reg =/^[A-Z a-z]+$/;
                if(reg.test(Fname.value)){
                    fdisplay.innerHTML="";
                    fdisplay.style.color="green";   
                    return true;
                }
                else{
                   fdisplay.innerHTML="Only letters are allowed";
                   fdisplay.style.color="red";
                    return false;
                }
            }
        }
function Movalidate()
        {
            var mobile= document.getElementById("mobile");
            var mdisplay = document.getElementById("mdisplay");
            if(mobile.value.trim()==""){
                mdisplay.innerHTML="Mobile NO Required";
                mdisplay.style.color="red";
                return false;
            }
            else{
                var reg =/^[6789][0-9]{9}/;
                if(reg.test(mobile.value)){
                    mdisplay.innerHTML="Valid";
                    mdisplay.style.color="Green";   
                    return true;
                }
                else{
                   mdisplay.innerHTML="Number should start with 6, 7, 8, or 9 and have 10 digits";
                   mdisplay.style.color="red";
                    return false;
                }
            }
        }
        function validateEmail() {
            var emailInput = document.getElementById("email");
            var emailDisplay = document.getElementById("edisplay");
            var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

            if (emailInput.value.trim() === "") {
                emailDisplay.innerHTML = "Email is required";
                emailDisplay.style.color = "red";
                return false;
            } else if (!emailPattern.test(emailInput.value)) {
                emailDisplay.innerHTML = "Invalid email format";
                emailDisplay.style.color = "red";
                return false;
            } else {
                emailDisplay.innerHTML = "";
                return true;
            }
        }
        
        
    function passValidate() {
        var pass = document.getElementById("pass");
        var confirmPass = document.getElementById("confirmPass");
        var pdisplay = document.getElementById("pdisplay");

        if (pass.value.trim() === "" || confirmPass.value.trim() === "") {
            pdisplay.innerHTML = "Passwords are required";
            pdisplay.style.color = "red";
            return false;
        } 
         else {
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

        if (pass.value.trim() === "" || confirmPass.value.trim() === "") {
            pdisplay.innerHTML = "Passwords are required";
            pdisplay.style.color = "red";
            return false;
        } else if (pass.value !== confirmPass.value) {
            pdisplay.innerHTML = "Passwords do not match";
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
 
</script>
</head>
<body>
   <div class="wrapper">
    <form action="userregistration" onsubmit="return validate">
      <h2> User Registration</h2>
      <div class="input-field">
        <input  onkeyup="namevalidate()"id="name" type="text"  name="name" >
        <span id="udisplay" style="color:red; font-size: 14px;">*</span>
        <label>Enter your Name</label>
      </div>
      <div class="input-field">
        <input  onkeyup="Fvalidate()" id="Fname" type="text" name="fname" >
        <span id="fdisplay" style="color:red; font-size: 14px;"></span>
        <label>Enter Father Name</label>
      </div>
      <div class="input-field">
        <input onkeyup="validateEmail()" id="email"  type="text" name="email">
       <span id="edisplay" style="color:red; font-size: 14px;"></span>
        <label>Enter your Email</label>
    </div>
      <div class="input-field">
          <input onkeyup=" passValidate()" id="pass" type="password" name="pass" >
        <span id="pdisplay" style="color:red; font-size: 14px;"></span>
        <label>Enter your password</label>
      </div>
      <div class="input-field">
        <input onkeyup="passValidate2()" id="confirmPass" type="password" name="cpass">
       <span id="pdisplay2" style="color:red; font-size: 14px;"></span>
        <label>Confirm password</label>
      </div>
      <div class="input-field">
        <input   id="mobile" onkeyup="Movalidate()" maxlength="10" type="text"  name="mob">
        <span id="mdisplay" style="color:red; font-size: 14px;">*</span>
        <label> Mobile Number</label>
    </div>
      
      <div class="input-field">
        <input type="text"  name="address">
<!--        <span id="mdisplay" style="color:red; font-size: 14px;">*</span>-->
        <label> Address</label>
    </div>
      <button type="submit" onsubmit="valid()" name="submit" value="submit">Register</button>
      <div class="register">
        <p>You already have an account? <a href="userlogin.jsp">Login</a></p>
      </div>
    </form>
  </div>
</body>
</html>
