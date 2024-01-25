CREATE TABLE LoanRequest(
  LoanRequestid int NOT NULL AUTO_INCREMENT,
  Acc_number int NOT NULL,
  Loan_Id int NOT NULL,
  Loan_Amount varchar(20) NOT NULL, 
  Loan_Term varchar(10) NOT NULL,
  Permanent_Address varchar(100) NOT NULL,
  Email varchar(30) NOT NULL,
  Mobile varchar(10) NOT NULL,
  Guarantor_name varchar(30) NOT NULL,
  Guarantor_Father varchar(30) NOT NULL,
  Guarantor_Gender varchar(10) NOT NULL,
  Guarantor_Address varchar(100) NOT NULL,
  Guarantor_Account varchar(20) NOT NULL,
  Guarantor_Bank varchar(100) NOT NULL,
  Guarantor_Ifsc varchar(10) NOT NULL,
  Guarantor_Adhar varchar(12) NOT NULL,
  Guarantor_Pan varchar(10)NOT NULL ,
  requestdate timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (LoanRequestid),
   KEY Acc_number_idx (Acc_number),
   KEY Loan_Idx (Acc_number),
  CONSTRAINT Acc_number FOREIGN KEY (Acc_number) REFERENCES Account (Account_Num),
  CONSTRAINT Loan_Id FOREIGN KEY (Loan_Id) REFERENCES Loan (Loanid)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

ALTER TABLE LoanRequest7
ADD  requestdate timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP;

ALTER TABLE customer
MODIFY COLUMN maritail varchar(25);


ALTER TABLE loanrequest7
DROP COLUMN requestdate;


CREATE TABLE UpdationRequest(
  Updationid int NOT NULL AUTO_INCREMENT,
 `Acc_number` int NOT NULL,
  Name varchar(20) NOT NULL, 
  Father_Name varchar(20) NOT NULL,
  Mother_Name varchar(20) NOT NULL,
  Gender varchar(10) NOT NULL,
  DOB varchar(15) NOT NULL,
  marital varchar(5) NOT NULL,
  Email varchar(30) NOT NULL,
  Mobile varchar(10) NOT NULL,
  address varchar(100) NOT NULL,
  city varchar(100) NOT NULL,
  district varchar(100) NOT NULL,
  state varchar(100) NOT NULL,
  pincode varchar(10) NOT NULL,
  nominee_name varchar(30) NOT NULL,
  nominee_Father varchar(30) NOT NULL,
  nominee_mobile varchar(10) NOT NULL,
  nominee_email varchar(30) NOT NULL,
  nominee_Aadhar varchar(12) NOT NULL,
   KEY Acc_number_idx (Acc_number),
   KEY Updationidx (Acc_number),
  CONSTRAINT Acc_number FOREIGN KEY (Acc_number) REFERENCES Account (Account_Num),
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE UpdationRequest (
  Updationid INT NOT NULL AUTO_INCREMENT,
  `Acc_number` int NOT NULL,
  Name VARCHAR(20) NOT NULL, 
  Father_Name VARCHAR(20) NOT NULL,
  Mother_Name VARCHAR(20) NOT NULL,
  Gender VARCHAR(10) NOT NULL,
  DOB varchar(15) NOT NULL,
 marital varchar(15) NOT NULL,
  Email VARCHAR(30) NOT NULL,
  Mobile VARCHAR(10) NOT NULL,
  address VARCHAR(100) NOT NULL,
  city VARCHAR(100) NOT NULL,
  district VARCHAR(100) NOT NULL,
  state VARCHAR(100) NOT NULL,
  pincode VARCHAR(10) NOT NULL,
  nominee_name VARCHAR(30) NOT NULL,
  nominee_Father VARCHAR(30) NOT NULL,
  nominee_mobile VARCHAR(10) NOT NULL,
  nominee_email VARCHAR(30) NOT NULL,
  nominee_Aadhar VARCHAR(12) NOT NULL,
  PRIMARY KEY (Updationid),
 KEY `Account_num_idx` (`Acc_number`),
  CONSTRAINT `Acc_number` FOREIGN KEY (`Acc_number`) REFERENCES `Account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;







<%
ArrayList<Loantypedao> loantypeDao  = (ArrayList<Loantypedao>)session.getAttribute("Loantypeda<%
                                    for(Loantypedao ldao: loantypeDao) {
                                %>
                                <option>
                                    <%= ldao.getName() %>
                                </option>
                                <%
                                }
                                %>");
%>
CREATE TABLE UpdationRequest (
  Updationid INT NOT NULL AUTO_INCREMENT,
  Acc_number INT NOT NULL,
  Updation_type VARCHAR(20) NOT NULL, 
  Name VARCHAR(20) NOT NULL, 
  Father_Name VARCHAR(20) NOT NULL,
  Mother_Name VARCHAR(20) NOT NULL,
  Gender VARCHAR(10) NOT NULL,
  DOB VARCHAR(15) NOT NULL,
  marital VARCHAR(15) NOT NULL,
  Email VARCHAR(30) NOT NULL,
  Mobile VARCHAR(10) NOT NULL,
  address VARCHAR(100) NOT NULL,
  city VARCHAR(100) NOT NULL,
  district VARCHAR(100) NOT NULL,
  state VARCHAR(100) NOT NULL,
  pincode VARCHAR(10) NOT NULL,
  nominee_name VARCHAR(30) NOT NULL,
  nominee_Father VARCHAR(30) NOT NULL,
  nominee_mobile VARCHAR(10) NOT NULL,
  nominee_email VARCHAR(30) NOT NULL,
  nominee_Aadhar VARCHAR(12) NOT NULL,
  requestdate timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (Updationid),
  KEY Account_num_idx (Acc_number),
  CONSTRAINT FK_Account_Num FOREIGN KEY (Acc_number) REFERENCES Account (Account_Num)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;






<%-- 
    Document   : Addbeneficiary
    Created on : Nov 27, 2023, 6:41:23 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta content="width=device-width, initial-scale=1.0" name="viewport" />

        <title>User-Dashboard</title>
        <meta content="" name="description" />
        <meta content="" name="keywords" />

        <!-- Favicons -->
        <link href="assets/img/logo.png" rel="icon" />
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon" />

        <!-- Google Fonts -->
        <link href="https://fonts.gstatic.com" rel="preconnect" />
        <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
            rel="stylesheet"
            />

        <!-- Vendor CSS Files -->
        <link
            href="assets/vendor/bootstrap/css/bootstrap.min.css"
            rel="stylesheet"
            />
        <link
            href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
            rel="stylesheet"
            />

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet" />


        <!-- fafa icons -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">


        <!-- responsive link -->

        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
        <!-- form link -->
        <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->



        <!-- css code -->
        <style>
            .box-custom {
                background-color: white;
                height: 150px;
                width: 120px;
                text-align: center;
                padding: 17px;
                margin-left: 15px;
            }

        </style>
    </head>
    <body>
        <!-- ======= Header ======= -->
        <%@include file="navbar2.jsp" %>

        <main id="main" class="main">
            <div class="pagetitle">
                <h1>Dashboard</h1>
                <nav>
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                        <li class="breadcrumb-item active">Dashboard</li>
                    </ol>
                </nav>
            </div>
            <!-- End Page Title -->



            <!-- E-governance -->
            <section class="section dashboard my-3 ml-3 ">
                <div class="container border p-20 mb-4" >
                    <h4 class="text-center my-3 mb-4">Add Beneficiary</h4>
                    <form class="row g-3 mb-3" action="../AddBeneficiary" method="post">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="control-label col-sm-2">Beneficiary Name</label>
                                <div class="col-sm-12">
                                    <!-- <textarea type="text" class="form-control" rows="2"></textarea> -->
                                    <input type="text" class="form-control" name="bName">
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="inputState" class="form-label">Select Bank</label>
                            <select id="inputState" class="form-select" name="bank">
                                <option selected>Choose</option>
                                <option>PNB</option>
                                <option>Bank Of Baroda</option>
                                <option>ICIC BANK</option>
                                <option>HDFC BANK</option>
                                <option>SWASTIK BANK</option>
                            </select>
                        </div>
                        <div class="col-md-6">
                            <label for="inputifsc" class="form-label">Enter IFSC</label>
                            <input type="text" class="form-control" id="inputifsc" name="ifscCode">
                        </div>
                        <div class="col-md-6">
                            <label for="inputAccNum" class="form-label">Enter Account Number</label>
                            <input type="tex" class="form-control" id="inputAccNum" name="accNum">
                        </div>
                        <div class="col-md-6">
                            <label for="inputCAccNum" class="form-label">Confirm Account Number</label>
                            <input type="text" class="form-control" id="inputCAccNum" name="CAccNum">
                        </div>
                        <div class="col-md-6">
                            <label for="inputlimit" class="form-label">Enter Daily Amount Limit</label>
                            <input type="text" class="form-control" id="inputlimit" name="limit">
                        </div>
                        <%@include file="../Components/alert_message.jsp" %>
                        <div class="text-center my-5">
                            <button class="btn btn-primary waves-effect waves-light " id="btn-submit">Add</button>
                        </div>
                    </form>
                </div>
            </section>
            <!-- shhshend -->

        </main>
        <!-- End #main -->

        <!-- ======= Footer ======= -->
        <%@include file="footer.jsp" %>
        <!-- End Footer -->

        <a
            href="#"
            class="back-to-top d-flex align-items-center justify-content-center"
            ><i class="bi bi-arrow-up-short"></i
            ></a>

        <!-- Vendor JS Files -->
        <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/chart.js/chart.umd.js"></script>
        <script src="assets/vendor/echarts/echarts.min.js"></script>
        <script src="assets/vendor/quill/quill.min.js"></script>
        <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
        <script src="assets/vendor/tinymce/tinymce.min.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>
    </body>
</html>




CREATE TABLE `Report` (
  `Report_id` int NOT NULL AUTO_INCREMENT,
   Acc_number int NOT NULL,
  `Report_Type` varchar(70) NOT NULL,
  `Report_Status` varchar(25) ,
  `Report_Solution` varchar (25),
   `Report_message` varchar(100) NOT NULL,
  `Report_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (`Report_id`),
   KEY Acc_number_idx (Acc_number),
  CONSTRAINT Acc_number FOREIGN KEY (Acc_number) REFERENCES Account (Account_Num),
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


KEY `Acc_numberx` (`Acc_number`),
  CONSTRAINT `Acc_number` FOREIGN KEY (`Acc_number`) REFERENCES `Account` (`Account_Num`)




  CREATE TABLE `Transaction_Information` (
  `Transaction_id` int NOT NULL AUTO_INCREMENT,
  `sender_Acc` int NOT NULL,
  `Receiver_Acc_num` int NOT NULL,
  `Amount` varchar(25) NOT NULL,
  `Tran_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Tran_Type` varchar(10) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Tran_status` varchar(10) NOT NULL,
   PRIMARY KEY (`Transaction_id`),
  KEY `sender_Acc_idx` (`sender_Acc`),
  KEY `Receiver_Acc_numdx` (`Receiver_Acc_num`),
  CONSTRAINT `Receiver_Acc_num` FOREIGN KEY (`Receiver_Acc_num`) REFERENCES `Beneficiary2` (`BeniAccount`),
  CONSTRAINT `sender_Acc` FOREIGN KEY (`sender_Acc`) REFERENCES `Account` (`Account_Num`)
  ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

  
CREATE TABLE `Beneficiary2` (
  `Beneficiary_Id` int NOT NULL AUTO_INCREMENT,
    `Acc_num` int NOT NULL,
  `Beneficiary_Name` varchar(25),
  `Bank` varchar(30),
  `ifsc` varchar(10),
  `BeniAccount` varchar(10),
  `Limit` varchar(10),
   PRIMARY KEY (`Beneficiary_Id`),
   KEY `BeniAccount_idx` (`BeniAccount`),
  CONSTRAINT `FAcc_num` FOREIGN KEY (`Acc_num`) REFERENCES `Account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


  ALTER TABLE Report
MODIFY COLUMN Report_Type varchar(60);

ALTER TABLE Customer
MODIFY maritail varchar(15);



CREATE TABLE `Transaction_Information` (
  `Transaction_id` int NOT NULL AUTO_INCREMENT,
  `sender_Acc` int NOT NULL,
  `Receiver_Acc_num` varchar(10) NOT NULL,  -- Change the data type to varchar(10)
  `Amount` varchar(25) NOT NULL,
  `Tran_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Tran_Type` varchar(10) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Tran_status` varchar(10) NOT NULL,
   PRIMARY KEY (`Transaction_id`),
  KEY `sender_Acc_idx` (`sender_Acc`),
  KEY `Receiver_Acc_numdx` (`Receiver_Acc_num`),
  CONSTRAINT `Receiver_Acc_num` FOREIGN KEY (`Receiver_Acc_num`) REFERENCES `Beneficiary2` (`BeniAccount`),
  CONSTRAINT `sender_Acc` FOREIGN KEY (`sender_Acc`) REFERENCES `Account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
