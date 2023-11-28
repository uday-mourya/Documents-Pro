<%-- 
    Document   : Registration
    Created on : 14-Nov-2023, 1:59:39 pm
    Author     : T460
--%>

<%-- 
    Document   : Login
    Created on : 14-Nov-2023, 1:22:21 pm
    Author     : T460
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.users.model.*"%>
<%
UserDAO udao = (UserDAO) request.getSession().getAttribute("udao");
if (udao != null) {
    response.sendRedirect("index.jsp");
}
EmployeeDAO edao = (EmployeeDAO) request.getSession().getAttribute("edao");
if (edao != null) {
    request.setAttribute("employee", edao);    
}

%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Registration Form Design </title>
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
  background-color: aliceblue;
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
  font-weight: 600;
  text-align: center;
  line-height: 70px;
  color: black;
  user-select: none;
  border-radius: 12px 12px 0 0;
/*  background: linear-gradient(-135deg, #c850c0, #4158d0);*/
}
.wrapper form{
  padding: 10px 20px 50px 30px;
}
.wrapper form .field{
  height: 35px;
  width: 100%;
  margin-top: 20px;
  position: relative;
}
.wrapper form .field input{
  height: 100%;
  width: 100%;
  outline: none;
  font-size: 14px;
  padding-left: 20px;
  border: 1px solid lightgrey;
  border-radius: 25px;
  transition: all 0.3s ease;
}
.wrapper form .field input:focus,
form .field input:valid{
  border-color: #4158d0;
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
  height: 40px;
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
  width: 10px;
  height: 10px;
  background: red;
}
form .content label{
  color: #262626;
  user-select: none;
  padding-left: 5px;
}
form .content .pass-link{
  color: "";
}
form .field input[type="submit"]{
  color: #fff;
  border: none;
  padding-left: 0;
  margin-top: -10px;
  font-size: 15px;
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
   <script>
            function validateForm() {
                var user = validateName();
                var country = validateCountry();
                var email = validateEmail();
                var pass = validatePass();
                var cpass = validatecPass();
              

                var ndisplay = document.getElementById("ndisplay");
                var Countrydisplay = document.getElementById("Countrydisplay");
                var edisplay = document.getElementById("edisplay");
                var pdisplay = document.getElementById("pdisplay");
                var cpdisplay = document.getElementById("cpdisplay");

                if (user == false || country == false || email == false || pass == false || cpass == false ) {
                    
                    return false;
                }
                return true;
            }

            function validateName() {
                var nameInput = document.getElementById("name");
                var nameDisplay = document.getElementById("ndisplay");
                var reg = /^[A-Za-z]+$/;

                if (nameInput.value.trim() === "") {
                    nameDisplay.innerHTML = "Name is required";
                    nameDisplay.style.color = "red";
                    nameInput.focus();
                    return false;
                } else if (!reg.test(nameInput.value)) {
                    nameDisplay.innerHTML = "Only letters are allowed";
                    nameDisplay.style.color = "red";
                    nameInput.focus();
                    return false;
                } else {
                    nameDisplay.innerHTML = "";
                    return true;
                }
            }
            function validateCountry() {
                var CnameInput = document.getElementById("Cname");
                var CnameDisplay = document.getElementById("Countrydisplay");
                var reg = /^[A-Za-z]+$/;

                if (fnameInput.value.trim() === "") {
                    CnameDisplay.innerHTML = "Country is required";
                    CnameDisplay.style.color = "red";
                    CnameInput.focus();
                    return false;
                } else if (!reg.test(CnameInput.value)) {
                    CnameDisplay.innerHTML = "Only letters are allowed";
                    CnameDisplay.style.color = "red";
                    CnameInput.focus();
                    return false;
                } else {
                    CnameDisplay.innerHTML = "";
                    return true;
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
      //        function validatePass() {
      //            var passInput = document.getElementById("pass");
      //            var passDisplay = document.getElementById("pdisplay");
      //           
      //
      //            if (passInput.value.trim() === "") {
      //                passDisplay.innerHTML = "pass is required";
      //                passDisplay.style.color = "red";
      //                return false;
      //            }else {
      //                passDisplay.innerHTML = "";
      //                return true;
      //            }
      //        }
      //        function validatecPass() {
      //            var passInput = document.getElementById("cpass");
      //            var passDisplay = document.getElementById("cpdisplay");
      //           
      //
      //            if (passInput.value.trim() === "") {
      //                passDisplay.innerHTML = "cpass is required";
      //                passDisplay.style.color = "red";
      //                return false;
      //            }else {
      //                passDisplay.innerHTML = "";
      //                return true;
      //            }
      //        }
            function validatePass() {
                var passInput = document.getElementById("pass");
                var passDisplay = document.getElementById("pdisplay");
                var passValue = passInput.value;

                if (passValue.trim() === "") {
                    passDisplay.innerHTML = "Password is required";
                    passDisplay.style.color = "red";
                    return false;
                } else if (passValue.length < 8) {
                    passDisplay.innerHTML = "Password must be at least 8 characters long";
                    passDisplay.style.color = "red";
                    return false;
                } else if (!/[A-Z]/.test(passValue)) {
                    passDisplay.innerHTML = "Password must contain at least one uppercase letter";
                    passDisplay.style.color = "red";
                    return false;
                } else if (!/[a-z]/.test(passValue)) {
                    passDisplay.innerHTML = "Password must contain at least one lowercase letter";
                    passDisplay.style.color = "red";
                    return false;
                } else if (!/\d/.test(passValue)) {
                    passDisplay.innerHTML = "Password must contain at least one digit";
                    passDisplay.style.color = "red";
                    return false;
                } else if (!/[!@#$%^&*()_+{}\[\]:;<>,.?~\\/-]/.test(passValue)) {
                    passDisplay.innerHTML = "Password must contain at least one special character";
                    passDisplay.style.color = "red";
                    return false;
                } else {
                    passDisplay.innerHTML = "";
                    return true;
                }
            }

            function validatecPass() {
                var passInput = document.getElementById("cpass");
                var passDisplay = document.getElementById("cpdisplay");
                var passValue = passInput.value;

                if (passValue.trim() === "") {
                    passDisplay.innerHTML = "Confirm password is required";
                    passDisplay.style.color = "red";
                    return false;
                } else if (passValue !== document.getElementById("pass").value) {
                    passDisplay.innerHTML = "Passwords do not match";
                    passDisplay.style.color = "red";
                    return false;
                } else {
                    passDisplay.innerHTML = "";
                    return true;
                }
            }

            
        </script>
   <body>
       <%@include file="navbar.jsp"  %>
       
      <div class="wrapper">
         <div class="title">
            New User
         </div>
          <form action="RegistrationTask" onsubmit="return validateForm()">
             <div class="field">
               <input type="text" onkeyup="validateName()" id="name" name="name" required>
               <span id="ndisplay"></span>
               <label>Name</label>
            </div>  
            <div class="field">
               <input type="text" onkeyup="validateEmail()" id="email" name="email" required>
               <span id="edisplay"></span>
               <label>Email Address</label>
            </div>
            <div class="field">
               <input type="password" onkeyup="validatePass()" id="pass" name="pass" required>
               <span id="pdisplay"></span>
               <label>Password</label>
            </div>
            <div class="field">
               <input type="password" onkeyup="validatecPass()"  id="cpass"  name="cpass" required>
               <span id="cpdisplay"></span>
               <label>Confirm Password</label>
            </div>
            <div class="field">
               <input type="text"  onkeyup="validateCountry()" id="Cname" name="Country" required>
               <span id="Countrydisplay"></span>
               <label>Country</label>
            </div>    
            <div class="content">
               <div class="checkbox">
                  <input type="checkbox" id="remember-me">
                  <label for="remember-me">know your details </label>
               </div>
            </div>
            <div class="field">
               <input type="submit" onsubmit="valid()" value="Register">
            </div>
            <div class="signup-link">
               Already a member? <a href="Login.jsp">Login now</a>
            </div>
         </form>
      </div>
     
   </body>
</html>