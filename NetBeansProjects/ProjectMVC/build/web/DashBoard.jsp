<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<%
    response.setHeader("Cache-Control","no-cache,no-store");
   String name =  (String)session.getAttribute("name");
   String fname = (String)session.getAttribute("father");
   String e =  (String)session.getAttribute("email");
   String contact =  (String)session.getAttribute("mobile");
   if(e==null){
            response.sendRedirect("Login.jsp");
    }
%>

<div id="container">
    <div class="row">
        <div class="col-lg-4 col-md-4 col-sm-12 col-12">
            <h1 class="mt-3 ms-3">Welcome : <%=name%></h1>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-12 col-12">
            <form class="d-flex">
                <input class="form-control me-2 my-4 border border-primary" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-primary my-4" type="submit">Search</button>
            </form>
        </div>
        <div class="col-lg-4 col-md-4 col-sm-12 d-flex">
              <form action='' id="log">
                  <input type="submit" name="submit" value="Logout" class="btn btn-primary mt-4">
                            <%
                                    String s = request.getParameter("submit");
                                   if (s != "" && s != null && s.equals("Logout")) 
                                   {
                                                               session.setAttribute("email", null);
                                                                session.invalidate();
                                                                response.sendRedirect("Login.jsp");
                                   }
                            %>
                        </form>
            <a class="mx-4 py-4"  href="">About Us</a>
            <a class="mx-4 py-4" href="">Sign up</a>
        </div>
    </div>
</div>



            <!-- Modal -->
            <div class="text-center mt-5">
                    <button class="btn btn-primary btn-center" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasRight" aria-controls="offcanvasRight">View Profile</button>
                 </div>
                        <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
                          <div class="offcanvas-header">
                              <h5 id="offcanvasRightLabel">Your Profile</h5>
                            <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                          </div>
                          <div class="offcanvas-body">
                              <table class="table table-bodered">
                                  <tr>
                                      <td>
                                          Name
                                      </td>
                                       <td>
                                          <%=name%>
                                      </td>
                                  </tr>
                                   <tr>
                                       <td>
                                          Father Name
                                      </td>
                                      <td>
                                          <%=fname%>
                                      </td>
                                  </tr>
                                   <tr>
                                       <td>
                                          email
                                      </td>
                                      <td>
                                          <%=e%>
                                      </td>
                                  </tr>
                                   <tr>
                                       <td>
                                          Mobile
                                      </td>
                                      <td>
                                          <%=contact%>
                                      </td>
                                  </tr>
                              </table>
                          </div>
                        </div>
                                      
                         <!-- Button trigger modal -->
                         <div class="text-center mt-5">
                             <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                Update Profile
                                </button>
                         </div>

<!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Update Your profile here</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                              </div>
                              <div class="modal-body">
                                <form id="yourFormId" onsubmit="return validateForm()" action="Update">

                          <div class="form-outline mb-4">
                              <input type="text" id="name" class="form-control form-control-lg" onkeyup="validateName()" name="newname" value="<%=name%>" />
                            <label class="form-label" for="name">Your Name</label>
                            <p id="namewarn" class="error"></p>
                          </div>
                            
                             <div class="form-outline mb-4">
                                 <input type="text" id="fname" class="form-control form-control-lg" onkeyup="validateFatherName()" name="newfather" value="<%=fname%>" />
                            <label class="form-label" for="fname">Your Father Name</label>
                            <p id="fnamewarn" class="error"></p>
                          </div>

                          <div class="form-outline mb-4">
                            <input type="email" id="email" class="form-control form-control-lg" onkeyup="validateEmail()"name="newregemail" value="<%=e%>"/>
                            <label class="form-label" for="email">Your Email</label>
                            <p id="emailwarn" class="error"></p>
                          </div>
                            
                            <div class="form-outline mb-4">
                                <input type="number" id="contact" class="form-control form-control-lg" onkeyup="validateMobileNumber()" name="newcontact" value="<%=contact%>" />
                            <label class="form-label" for="contact">Enter Mobile</label>
                            <p id="mobilewarn" class="error"></p>
                          </div>

                         

                          <div class="form-check d-flex justify-content-center mb-5">
                            <input class="form-check-input me-2" type="checkbox" value="" id="agree" />
                            <label class="form-check-label" for="agree">
                              I agree all statements in <a href="#!" class="text-body"><u>Terms of service</u></a>
                            </label>
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

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<script>
    function validateName() {
                        const nameInput = document.getElementById("name").value.trim(); // Replace "name" with your input field's ID
                        const nameWarning = document.getElementById("namewarn");

                        // Regular expression to match only letters and spaces
                        const namePattern = /^[A-Za-z\s]+$/;

                        if (nameInput.length === 0) {
                          nameWarning.innerHTML = "Name field is empty";
                          return false;
                        } else if (!namePattern.test(nameInput)) {
                          nameWarning.innerHTML = "Name can only contain letters and spaces";
                          return false;
                        } else { 
                          nameWarning.innerHTML = "";
                          return true;
                          // The name is valid; you can proceed with further actions or form submission.
                        }
            }
            function validateFatherName() {
                        const fnameInput = document.getElementById("fname").value.trim(); // Replace "name" with your input field's ID
                        const fnameWarning = document.getElementById("fnamewarn");

                        // Regular expression to match only letters and spaces
                        const fnamePattern = /^[A-Za-z\s]+$/;

                        if (fnameInput.length === 0) {
                          fnameWarning.innerHTML = "father Name field is empty";
                          return false;
                        } else if (!fnamePattern.test(fnameInput)) {
                          fnameWarning.innerHTML = "father Name can only contain letters and spaces";
                          return false;
                        } else {
                          fnameWarning.innerHTML = "";
                          return true;
                          // The name is valid; you can proceed with further actions or form submission.
                        }
            }
            function validateEmail() {
                            const emailInput = document.getElementById("email").value.trim();
                            const emailWarning = document.getElementById("emailwarn");
                            const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

                            if (emailInput.length === 0) {
                              emailWarning.innerHTML = "Email field is empty";
                              return false;
                            } else if (!emailPattern.test(emailInput)) {
                              emailWarning.innerHTML = "Email is not valid";
                              return false;
                            } else {
                              emailWarning.innerHTML = ""; 
                              return true;
                            }
          }
          function validateMobileNumber() {
                        const mobileInput = document.getElementById("contact").value.trim();
                        const mobileWarning = document.getElementById("mobilewarn");
                        const mobilePattern = /^[6-9]\d{0,9}$/; // Matches numbers starting with 6, 7, 8, or 9 and up to 10 digits.

                        if (mobileInput.length === 0) {
                          mobileWarning.innerHTML = "Mobile number is empty";
                          return false;
                        }else if(mobileInput.length<10){
                             mobileWarning.innerHTML = "length should be 10";
                            
                        }else if (!mobilePattern.test(mobileInput)) {
                          mobileWarning.innerHTML = "Mobile number is not valid";
                          return false;
                        } else {
                          mobileWarning.innerHTML = "";
                          return true;
                        }
                      }
                      function validateForm() {
                                // Call individual validation functions and store their results
                                const isNameValid =validateName();
                                const isFnameValid = validateFatherName();
                                const isEmailValid = validateEmail();
                                const isMobileValid = validateMobileNumber();
                                

                                // Check if all validations pass
                                if (isNameValid && isFnameValid && isEmailValid && isMobileValid) {
                                  // All validations passed, submit the form
                                  
                                  return true;
                                }
                                else{
                                    return false;
                                }
                        }
</script>
</body>
</html>
