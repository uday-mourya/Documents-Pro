<%-- 
    Document   : UserDashboard
    Created on : Nov 19, 2023, 9:49:02 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.employee.model.productDAO" %>
<%@ page import="com.employee.model.productDTO" %>

<%@ page import="com.employee.model.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Document</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            body {
                font-family: 'Lato', arial, sans-serif;
                margin: 0;
            }

            .content-container {
                position: relative;
                z-index: 0;
                padding-left: 80px;
                padding-top: 15px;
                margin: 0 auto;
                overflow: hidden;
                transition: all 300ms ease-in-out;
            }
            #cartCount{

            }


            .slideout-sidebar {
                position: fixed;
                top: 0;
                left: -190px;
                z-index: 0;
                width: 150px;
                height: 100%;
                padding: 20px;
                background-color: #212121;
                transition: all 300ms ease-in-out;
            }

            .slideout-sidebar ul {
                list-style: none;
                margin: 0;
                padding: 0;
            }

            .slideout-sidebar ul li {
                cursor: pointer;
                padding: 18px 0;
                border-bottom: 1px solid rgba(244,244,244,0.4);
                color: rgba(244,244,244,0.7);
            }

            .slideout-sidebar ul li:last-child {
                border-bottom: 0;
            }

            .slideout-sidebar ul li:hover {
                color: rgba(244,244,244,1);
            }


            #menu-toggle {
                display: none;
            }

            .menu-icon {
                position: absolute;
                top: 18px;
                left: 30px;
                font-size: 24px;
                z-index: 1;
                transition: all 300ms ease-in-out;
            }



            /*-- The Magic --*/
            #menu-toggle:checked ~ .slideout-sidebar {
                left: 0px;
            }

            #menu-toggle:checked + .menu-icon {
                left: 210px;
            }

            #menu-toggle:checked ~ .content-container {
                padding-left: 250px;
            }

            /* -- Media Queries -- */

            @media (max-width: 991px) {

                .content-container {
                    max-width: 480px;
                }

            }

            @media (max-width: 767px) {

                .content-container {
                    max-width: 100%;
                    margin: 30px auto 0;
                }

                #menu-toggle:checked ~ .content-container {
                    padding-left: 0;
                }

                .slideout-sidebar ul {
                    text-align: center;
                    max-width: 200px;
                    margin: 30px auto 0;
                }

                .menu-icon {
                    left: 20px
                }

                #menu-toggle:checked ~ .slideout-sidebar {
                    width: 100%;
                }

                #menu-toggle:checked + .menu-icon {
                    left: 87%;
                    color: #fafafa;
                }

                @media screen
                and (max-width: 736px)
                and (orientation: landscape) {

                    .slideout-sidebar {
                        padding: 0;
                    }

                    .slideout-sidebar ul {
                        max-width: 100%;
                        margin: 60px auto 0;
                    }

                    .slideout-sidebar ul li {
                        display: inline-block;
                        border-bottom: 0;
                        width: 72px;
                        padding: 18px 24px;
                        margin: 0 6px 12px;
                        color: #ffffff;
                        background-color: #777;
                    }

                }

            }
        </style>
    </head>

    <body>
        <% 
   productDAO dao = new productDAO(); 
   productDTO dao1 = new productDTO();
   boolean hasRecords = dao1.allFood(dao);
   ArrayList<ArrayList<String>> al = dao.getAl();
   if (hasRecords) {
       al = dao.getAl();
   }
%>

        <input type="checkbox" id="menu-toggle" checked />
        <label for="menu-toggle" class="menu-icon"><i class="fa fa-bars"></i></label>
        <div class="content-container" style="position: relative">
            <div>
                <h1 class="h2 fw-bolder d-inline"><span style="color: orange;">Yummy</span> Yard <i class="fa fa-shopping-cart"
                                                                                       style="color:orange;" aria-hidden="true"></i></h1>
                <div href="" class="text-dark  nav-link" style="text-decoration: none;position: absolute;top: 0%;right: 0%;">
                    <div class="m-0 p-0"><span class="fw-nornal ms-3 m-0 p-0 " style="font-size: 12px" id="cart">4</span>
                    
                    <div class="d-flex d-flex justify-content-center align-items-center m-0 p-0"><i
                            class="fa fa-shopping-cart fs-3 m-0 p-0"></i><span class=" ms-2 m-0 p-0" id="totalPrice">₹ 1100
                        </span>
                    </div>
                    </div>  
                    </div>
            </div>
                    <div class="row row-cols-lg-3 my-5 row-cols-md-2 row-cols-1">
                        <% for (ArrayList<String> record : al) { %>
                        <div class="col my-3 p-2 rounded-3 text-center">
                                
                                <h4 class="text-dark text-center pt-2"><%= record.get(2) %></h4>
                                <span class="text-dark text-center"><%= record.get(1) %></span>
                                <h4>Price : <span><%= record.get(3) %></span></h4>
                        </div>
                        <% } %>
                    </div>
               
            </div>

        
        <div class="slideout-sidebar">
            <ul>
                <li><a href="#" style="text-decoration: none;color: rgba(244,244,244,0.7);">Product</a></li>
                <li><a href="#" style="text-decoration: none;color: rgba(244,244,244,0.7);">Profile</a></li>
                <li><a href="#" style="text-decoration: none;color: rgba(244,244,244,0.7);">Cart</a></li>
                <li><a href="#" style="text-decoration: none;color: rgba(244,244,244,0.7);">Feedback</a></li>
            </ul>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    </body>

</html>