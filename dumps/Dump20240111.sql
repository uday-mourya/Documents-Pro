CREATE DATABASE  IF NOT EXISTS `swastik` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `swastik`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: swastik
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;


/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;


CREATE TABLE `account` (
  `Account_Num` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `Account_Type` varchar(25) NOT NULL,
  `Current_Balance` varchar(50) NOT NULL,
  `Branch_id` int NOT NULL,
  `Account_Status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Account_Num`),
  KEY `customer_id_idx` (`customer_id`),
  KEY `Branch_id_idx` (`Branch_id`),
  CONSTRAINT `Branch_id` FOREIGN KEY (`Branch_id`) REFERENCES `branch` (`Branchid`),
  CONSTRAINT `customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customerid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (8,4,'Current','8050.0',701,'Active'),(9,7,'Current','530.0',701,'Active'),(10,8,'Current','210.0',701,'Active'),(11,12,'Current','20.0',701,'Active'),(12,13,'Current','0.0',701,'Active'),(13,14,'Current','0.0',701,'Active'),(14,15,'Current','0.0',701,'Active'),(15,21,'Current','0.0',701,'Active'),(16,24,'Current','0.0',701,'Active');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `beneficiary`
--

DROP TABLE IF EXISTS `beneficiary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `beneficiary` (
  `Beneficiary_Id` int NOT NULL AUTO_INCREMENT,
  `Acc_num` int NOT NULL,
  `Beneficiary_Name` varchar(25) DEFAULT NULL,
  `Bank` varchar(30) DEFAULT NULL,
  `ifsc` varchar(10) DEFAULT NULL,
  `Account_Num` varchar(10) DEFAULT NULL,
  `Limit` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Beneficiary_Id`),
  KEY `Account_num_idx` (`Account_Num`),
  KEY `Acc_num` (`Acc_num`),
  CONSTRAINT `Acc_num` FOREIGN KEY (`Acc_num`) REFERENCES `account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `beneficiary`
--

LOCK TABLES `beneficiary` WRITE;
/*!40000 ALTER TABLE `beneficiary` DISABLE KEYS */;
INSERT INTO `beneficiary` VALUES (8,8,'ayush','SWASTIK BANK','SWSTK2569','9','1000');
/*!40000 ALTER TABLE `beneficiary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `beneficiary2`
--

DROP TABLE IF EXISTS `beneficiary2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `beneficiary2` (
  `Beneficiary_Id` int NOT NULL AUTO_INCREMENT,
  `Acc_num` int NOT NULL,
  `Beneficiary_Name` varchar(25) DEFAULT NULL,
  `Bank` varchar(30) DEFAULT NULL,
  `ifsc` varchar(10) DEFAULT NULL,
  `BeniAccount` varchar(10) DEFAULT NULL,
  `Limit` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Beneficiary_Id`),
  KEY `BeniAccount_idx` (`BeniAccount`),
  KEY `FAcc_num` (`Acc_num`),
  CONSTRAINT `FAcc_num` FOREIGN KEY (`Acc_num`) REFERENCES `account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `beneficiary2`
--

LOCK TABLES `beneficiary2` WRITE;
/*!40000 ALTER TABLE `beneficiary2` DISABLE KEYS */;
INSERT INTO `beneficiary2` VALUES (8,8,'ayush','SWASTIK BANK','SWSTK2569','9','1000'),(9,8,'mohit','SWASTIK BANK','SWSTK25','10','1000'),(10,9,'ayush','SWASTIK BANK','SWSTK2569','9','100'),(11,9,'uday','SWASTIK BANK','SWSTK25690','8','1000'),(12,9,'uday','SWASTIK BANK','SWSTK25690','10','1000'),(13,9,'uday','SWASTIK BANK','SWSTK2569','8','1000'),(14,10,'uday','SWASTIK BANK','SWSTK2569','8','1000'),(21,8,'ayush','SWASTIK BANK','SWSTK25690','9','1000'),(22,8,'soniya','SWASTIK BANK','SWSTK2569','11','1000'),(27,11,'uday','SWASTIK BANK','SWSTK25690','8','100');
/*!40000 ALTER TABLE `beneficiary2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branch` (
  `Branchid` int NOT NULL,
  `ifsc` varchar(10) NOT NULL,
  `Branch_name` varchar(100) NOT NULL,
  `Branch_Address` varchar(100) NOT NULL,
  PRIMARY KEY (`Branchid`),
  UNIQUE KEY `Branch_name` (`Branch_name`),
  UNIQUE KEY `Branch_Address` (`Branch_Address`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch`
--

LOCK TABLES `branch` WRITE;
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` VALUES (701,'SWSTK25690','Swastik Bank Mari Mata Square indore','Ujjen raod Mari Mata Square'),(702,'SWSTK25691','Swastik Bank Mari Teen Imli indore','Nemavar Road Teen Imli'),(703,'SWSTK25693','Swastik Bank Supercoridor indore','Airport Road Indore');
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `customerid` int NOT NULL AUTO_INCREMENT,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `father` varchar(100) NOT NULL,
  `mother` varchar(100) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `adhar` varchar(100) NOT NULL,
  `registerdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pan` varchar(100) NOT NULL,
  `maritail` varchar(25) DEFAULT NULL,
  `occupation` varchar(100) NOT NULL,
  `address` varchar(250) NOT NULL,
  `city` varchar(100) NOT NULL,
  `distric` varchar(100) NOT NULL,
  `pincode` varchar(10) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`customerid`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `phone_UNIQUE` (`phone`),
  UNIQUE KEY `adhar_UNIQUE` (`adhar`),
  UNIQUE KEY `pan_UNIQUE` (`pan`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (4,'uday@123','uday mourya','gggg','hhhh','male','2023-12-13','8889898989','uday121@gmail.com','8877','2023-12-02 09:03:57','67676','city1','state2','77676','hhhhh','yyytyt','hhhh','yyytyt'),(7,'123','Ayush jjj','dggdg','hdhhd','male','2023-12-13','9691669473','ayush@gmail.com','987654321231','2023-12-12 05:02:12','AAAAA1234A','single','teacher','33','indore','indore','636363','Madhya Pradesh'),(8,'123','mohit choudhary','dd','dd','male','2023-12-14','8602289703','mohit@gmail.com','987654321211','2023-12-13 06:39:34','AAAAA1234B','single','teacher','indore','indore','indore','636363','Madhya Pradesh'),(12,'123','soniya ddd','dggdg','hdhhd','female','2023-12-15','9691669433','soniya@gmail.com','987654321233','2023-12-14 06:09:58','AAAAA1234C','single','student','33','indore','indore','636363','Madhya Pradesh'),(13,'1234','uday mourya','Bhanu','hdhhd','male','2023-12-15','9691669493','udaymourya01@gmail.com','987654321235','2023-12-14 06:55:29','AAAAA1234G','single','engineer','33','indore','indore','636363','Madhya Pradesh'),(14,'123','uday jjj','dggdg','hdhhd','male','2023-12-08','9691669446','udaymourya19@gmail.com','987654321222','2023-12-14 06:58:19','AAAAA1234U','single','engineer','33','indore','indore','636363','Madhya Pradesh'),(15,'123','uday djj','dggdg','hdhhd','male','2023-12-15','9691669443','udaymourya921@gmail.com','987654321221','2023-12-14 07:08:58','AAAAA1234Q','single','student','33','indore','indore','636363','Madhya Pradesh'),(21,'123','Ayush mourya','bhanupratap ','pinki','male','2023-12-23','9691669098','ayush11@gmail.com','987654321111','2023-12-22 06:20:02','ABAAA1234A','single','engineer','33','indore','indore','636363','Madhya Pradesh'),(24,'123','uday mourya','mmama','mama','male','2023-12-15','8989898989','udaymourya111@gmail.com','987654322222','2023-12-27 06:45:43','AAAAA1234Y','married','teacher','33','indore','indore','636363','Madhya Pradesh');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Employeeid` int NOT NULL AUTO_INCREMENT,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `doh` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `salary` varchar(15) NOT NULL,
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`Employeeid`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (3,'123','uday','uday@gmail.com','13/01/2004','2023-12-14 17:21:29','3000','4747474');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_request`
--

DROP TABLE IF EXISTS `employee_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_request` (
  `Employeeid` int NOT NULL AUTO_INCREMENT,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `doh` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `salary` varchar(15) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `position` varchar(30) NOT NULL,
  `approval` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`Employeeid`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_request`
--

LOCK TABLES `employee_request` WRITE;
/*!40000 ALTER TABLE `employee_request` DISABLE KEYS */;
INSERT INTO `employee_request` VALUES (3,'123','soniya','soniya@gmail.com','2023-12-15','2023-12-14 04:55:48','','','',0),(5,'1234','uday','udaymourya9@gmail.com','2023-12-07','2023-12-14 04:57:08','3333','9691669474','loan',0),(6,'123','Sanjay','sanjay@gmail.com','2001-03-12','2023-12-14 10:54:57','20000','9691669333','Accountant',0),(7,'000','Kirti','kirti@gmail.com','2002-03-12','2023-12-14 10:57:59','20000','7388383838','Loan',0),(10,'0000','manju','manju@gmail.com','2002-07-03','2023-12-14 11:03:06','10000','7474774774','Loan',0),(11,'123','mohit','mohit@gmail.com','2023-12-13','2023-12-14 14:51:36','10000','9691668899','cashiaer',0);
/*!40000 ALTER TABLE `employee_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loan`
--

DROP TABLE IF EXISTS `loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loan` (
  `Loanid` int NOT NULL,
  `name` varchar(30) NOT NULL,
  `Intrest_Rate` varchar(100) NOT NULL,
  `Duration` varchar(100) NOT NULL,
  PRIMARY KEY (`Loanid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan`
--

LOCK TABLES `loan` WRITE;
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
INSERT INTO `loan` VALUES (10001,'Home Loan','11','20'),(10002,'Education Loan','9','20'),(10003,'Car Loan','12','20'),(10004,'Personal Loan','15','20');
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loanrequest2`
--

DROP TABLE IF EXISTS `loanrequest2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loanrequest2` (
  `LoanRequestid` int NOT NULL AUTO_INCREMENT,
  `Acc_number` int NOT NULL,
  `Beneficiary_Name` varchar(25) NOT NULL,
  `Adhar_num` varchar(20) NOT NULL,
  `Pan_Num` varchar(10) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Guarantor_name` varchar(30) NOT NULL,
  `Guarantor_Father` varchar(30) NOT NULL,
  `Guarantor_Gender` varchar(10) NOT NULL,
  `Guarantor_Address` varchar(100) NOT NULL,
  `Guarantor_Account` varchar(20) NOT NULL,
  `Guarantor_Ifsc` varchar(10) NOT NULL,
  `Guarantor_Adhar` varchar(12) NOT NULL,
  `Guarantor_Pan` varchar(10) NOT NULL,
  PRIMARY KEY (`LoanRequestid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loanrequest2`
--

LOCK TABLES `loanrequest2` WRITE;
/*!40000 ALTER TABLE `loanrequest2` DISABLE KEYS */;
INSERT INTO `loanrequest2` VALUES (8,2726,'sgggs','123456789333','AAAAA1234A','hfgfggfgfg','uday121@gmail.com','gdgdgd','hdhhd','on','indore','1234','1234','123456782345','AAABB1234S'),(9,2726,'sgggs','123456789333','AAAAA1234A','hfgfggfgfg','uday121@gmail.com','gdgdgd','hdhhd','on','indore','1234','1234','123456782345','AAABB1234S'),(10,2726,'sgggs','123456789333','AAAAA1234A','hfgfggfgfg','uday121@gmail.com','gdgdgd','hdhhd','Male','indore','1234','1234','123456782345','AAABB1234S'),(11,284737,'Uday Mourya','274792439376','AAAAA1234A','Supercoridor Indore','uday121@gmail.com','Demo','Demoaa','Male','indore','1236655','1236655','676767676767','AAABB1234S'),(12,284737,'Uday Mourya','274792439376','AAAAA1234A','Supercoridor Indore','uday121@gmail.com','Demo','Demoaa','Male','indore','1236655','1236655','','AAABB1234S'),(13,284737,'Uday Mourya','274792439376','AAAAA1234A','Supercoridor Indore','uday121@gmail.com','Demo','Demoaa','Male','indore','1236655','1236655','123456782345','AAABB1234S'),(14,284737,'Uday Mourya','274792439376','AAAAA1234A','Supercoridor Indore','uday121@gmail.com','Demo','Demoaa','Male','indore','1236655','1236655','123456782345','AAABB1234S');
/*!40000 ALTER TABLE `loanrequest2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loanrequest3`
--

DROP TABLE IF EXISTS `loanrequest3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loanrequest3` (
  `LoanRequestid` int NOT NULL AUTO_INCREMENT,
  `Loan_type` varchar(25) NOT NULL,
  `Loan_Amount` varchar(20) NOT NULL,
  `Loan_Term` varchar(10) NOT NULL,
  `Permanent_Address` varchar(100) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Mobile` varchar(30) NOT NULL,
  `Guarantor_name` varchar(30) NOT NULL,
  `Guarantor_Father` varchar(30) NOT NULL,
  `Guarantor_Gender` varchar(10) NOT NULL,
  `Guarantor_Address` varchar(100) NOT NULL,
  `Guarantor_Account` varchar(10) NOT NULL,
  `Guarantor_Adhar` varchar(12) NOT NULL,
  `Guarantor_Pan` varchar(10) NOT NULL,
  PRIMARY KEY (`LoanRequestid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loanrequest3`
--

LOCK TABLES `loanrequest3` WRITE;
/*!40000 ALTER TABLE `loanrequest3` DISABLE KEYS */;
INSERT INTO `loanrequest3` VALUES (1,'Education Loan','400000','5 Years','ggfg','udaymourya921@gmail.com','5 Years','uday','grrgg','Male','gfggf','6664','123456782345','AAAAA1234A');
/*!40000 ALTER TABLE `loanrequest3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loanrequest4`
--

DROP TABLE IF EXISTS `loanrequest4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loanrequest4` (
  `LoanRequestid` int NOT NULL AUTO_INCREMENT,
  `Loan_type` varchar(25) NOT NULL,
  `Loan_Amount` varchar(20) NOT NULL,
  `Loan_Term` varchar(10) NOT NULL,
  `Permanent_Address` varchar(100) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Mobile` varchar(10) NOT NULL,
  `Guarantor_name` varchar(30) NOT NULL,
  `Guarantor_Father` varchar(30) NOT NULL,
  `Guarantor_Gender` varchar(10) NOT NULL,
  `Guarantor_Address` varchar(100) NOT NULL,
  `Guarantor_Account` varchar(20) NOT NULL,
  `Guarantor_Bank` varchar(100) NOT NULL,
  `Guarantor_Ifsc` varchar(10) NOT NULL,
  `Guarantor_Adhar` varchar(12) NOT NULL,
  `Guarantor_Pan` varchar(10) NOT NULL,
  PRIMARY KEY (`LoanRequestid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loanrequest4`
--

LOCK TABLES `loanrequest4` WRITE;
/*!40000 ALTER TABLE `loanrequest4` DISABLE KEYS */;
INSERT INTO `loanrequest4` VALUES (1,'Education Loan','400000','5 Years','udaymourya921@gmail.com','udaymourya921@gmail.com','5 Years','uday','hfhhhfhhf','Male','gfggf','1236655','HDFC BANK','SWSK25690','123456782345','AAABB1234S'),(2,'Car Loan','400000','5 Years','udaymourya921@gmail.com','udaymourya921@gmail.com','5 Years','uday','hfhhhfhhf','Male','gfggf','1236655','ICIC BANK','SWSK25690','123456782345','AAABB1234S'),(3,'Education Loan','400000','5 Years','udaymourya921@gmail.com','udaymourya921@gmail.com','5 Years','uday','hdhhd','Male','gfggf','1236655','HDFC BANK','SWSK25690','123456782345','AAAAA1234A'),(4,'Car Loan','400000','5 Years','udaymourya921@gmail.com','udaymourya921@gmail.com','5 Years','uday','','Male','gfggf','1236655','PNB','SWSK25690','123456782345','AAABB1234S'),(5,'Car Loan','400000','3 Years','udaymourya921@gmail.com','udaymourya921@gmail.com','3 Years','uday','hdhhd','Male','gfggf','1236655','HDFC BANK','SWSK25690','123456782345','AAABB1234S');
/*!40000 ALTER TABLE `loanrequest4` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manager` (
  `Managerid` int NOT NULL AUTO_INCREMENT,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `doh` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `salary` varchar(15) NOT NULL,
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`Managerid`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manager`
--

LOCK TABLES `manager` WRITE;
/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` VALUES (3,'123','manju','manju@gmail.com','13/01/2004','2023-12-14 04:32:58','4000','74748747');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nomineedetails`
--

DROP TABLE IF EXISTS `nomineedetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nomineedetails` (
  `customerid` int NOT NULL,
  `Nominee_Name` varchar(25) DEFAULT NULL,
  `dob` varchar(10) DEFAULT NULL,
  `Relation` varchar(10) DEFAULT NULL,
  `Adhar` varchar(10) DEFAULT NULL,
  `Address` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`customerid`),
  KEY `customerid_idx` (`customerid`),
  CONSTRAINT `customerid` FOREIGN KEY (`customerid`) REFERENCES `customer` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nomineedetails`
--

LOCK TABLES `nomineedetails` WRITE;
/*!40000 ALTER TABLE `nomineedetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `nomineedetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `report`
--

DROP TABLE IF EXISTS `report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `report` (
  `Report_id` int NOT NULL AUTO_INCREMENT,
  `Acc_number` int NOT NULL,
  `Report_Type` varchar(60) DEFAULT NULL,
  `Report_Status` varchar(25) DEFAULT NULL,
  `Report_Solution` varchar(25) DEFAULT NULL,
  `Report_message` varchar(100) NOT NULL,
  `Report_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Report_id`),
  KEY `FK_Acc_number` (`Acc_number`),
  CONSTRAINT `FK_Acc_number` FOREIGN KEY (`Acc_number`) REFERENCES `account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `report`
--

LOCK TABLES `report` WRITE;
/*!40000 ALTER TABLE `report` DISABLE KEYS */;
INSERT INTO `report` VALUES (8,8,'Request Invoice for order',NULL,NULL,'hhh','2023-12-12 15:41:21'),(9,8,'Request order status',NULL,NULL,'hhh','2023-12-12 15:42:36'),(10,8,'Request Invoice for order',NULL,NULL,'hh','2023-12-12 15:44:17'),(11,8,'Request order status',NULL,NULL,'jjj','2023-12-12 15:45:30'),(12,8,'Request order status',NULL,NULL,'hhhdhc','2023-12-13 05:14:03'),(13,8,'Amount transferred to wrong account',NULL,NULL,'hhhhhh','2023-12-14 07:51:59'),(14,8,'Amount transferred to wrong account',NULL,NULL,'dhdhd','2023-12-15 10:48:01'),(15,8,'Amount transferred to wrong account',NULL,NULL,'nnn','2023-12-15 16:47:04'),(16,8,'The amount has been deducted from our account',NULL,NULL,'kkk','2023-12-16 07:15:32');
/*!40000 ALTER TABLE `report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reviewandrating`
--

DROP TABLE IF EXISTS `reviewandrating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reviewandrating` (
  `cid` int NOT NULL,
  `Review` varchar(25) NOT NULL,
  `Review_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Rating` varchar(10) NOT NULL,
  PRIMARY KEY (`cid`),
  KEY `cid_idx` (`cid`),
  CONSTRAINT `cid` FOREIGN KEY (`cid`) REFERENCES `customer` (`customerid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviewandrating`
--

LOCK TABLES `reviewandrating` WRITE;
/*!40000 ALTER TABLE `reviewandrating` DISABLE KEYS */;
/*!40000 ALTER TABLE `reviewandrating` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction_information`
--

DROP TABLE IF EXISTS `transaction_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction_information` (
  `Transaction_id` int NOT NULL AUTO_INCREMENT,
  `sender_Acc` int NOT NULL,
  `Receiver_Acc_num` varchar(10) NOT NULL,
  `Amount` varchar(25) NOT NULL,
  `Tran_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Tran_Type` varchar(10) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Tran_status` varchar(10) NOT NULL,
  PRIMARY KEY (`Transaction_id`),
  KEY `sender_Acc_idx` (`sender_Acc`),
  KEY `Receiver_Acc_numdx` (`Receiver_Acc_num`),
  CONSTRAINT `Receiver_Acc_num` FOREIGN KEY (`Receiver_Acc_num`) REFERENCES `beneficiary2` (`BeniAccount`),
  CONSTRAINT `sender_Acc` FOREIGN KEY (`sender_Acc`) REFERENCES `account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction_information`
--

LOCK TABLES `transaction_information` WRITE;
/*!40000 ALTER TABLE `transaction_information` DISABLE KEYS */;
INSERT INTO `transaction_information` VALUES (8,8,'9','100','2023-12-15 10:17:58','NEFT','hello','success'),(9,8,'9','100','2023-12-15 11:17:06','NEFT','hello','success'),(10,8,'9','100','2023-12-15 11:26:31','NEFT','hello','success'),(11,8,'9','100','2023-12-15 11:33:06','NEFT','hello','success'),(12,8,'9','100','2023-12-15 11:58:06','NEFT','jgjj','success'),(13,8,'10','10','2023-12-15 12:01:30','NEFT','hello','success'),(14,8,'9','100','2023-12-15 15:14:36','RTGS','hello','success'),(15,8,'9','10','2023-12-15 16:32:33','RTGS','jgjj','success'),(16,8,'9','10','2023-12-15 16:33:11','NEFT','jgjj','success'),(17,8,'9','100','2023-12-15 16:48:59','NEFT','hello','success'),(18,9,'9','100','2023-12-15 16:54:10','NEFT','hello','success'),(19,8,'10','70','2023-12-16 04:31:09','RTGS','wsw','success'),(20,9,'8','20','2023-12-16 04:56:24','NEFT','hello','success'),(21,10,'8','10','2023-12-16 07:22:05','RTGS','sjsj','success'),(22,8,'10','100','2023-12-16 12:52:30','RTGS','hello','success'),(23,8,'10','30','2023-12-16 15:20:06','NEFT','hello','success'),(24,8,'11','70','2023-12-18 05:28:50','RTGS','jfjj','success'),(25,8,'9','130','2023-12-18 07:13:48','NEFT','hdhd','success'),(26,8,'11','10','2023-12-18 13:47:01','RTGS','hello','success'),(27,11,'8','50','2023-12-19 04:28:33','RTGS','hfhhf','success'),(28,11,'8','10','2023-12-19 04:32:44','RTGS','hello','success');
/*!40000 ALTER TABLE `transaction_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unblock`
--

DROP TABLE IF EXISTS `unblock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unblock` (
  `Unblock_id` int NOT NULL AUTO_INCREMENT,
  `Acc_number` int NOT NULL,
  `Adhar` varchar(12) NOT NULL,
  `Pan` varchar(10) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Mobile` varchar(10) NOT NULL,
  `Unlockreq` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Unblock_id`),
  KEY `Acc_number_idx` (`Acc_number`),
  CONSTRAINT `Acc_number_fk` FOREIGN KEY (`Acc_number`) REFERENCES `account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unblock`
--

LOCK TABLES `unblock` WRITE;
/*!40000 ALTER TABLE `unblock` DISABLE KEYS */;
INSERT INTO `unblock` VALUES (8,8,'1234','aaaa','udaymourya921@gmail.com','9691669473','2023-12-13 01:10:17'),(9,8,'123475757','AAAAA1234A','udaymourya01@gmail.com','8871346185','2023-12-13 01:12:19'),(10,8,'123456789987','AAAAA1234A','udaymourya921@gmail.com','8871346185','2023-12-13 01:27:24'),(11,8,'123456789987','AAAAA1234A','udaymourya921@gmail.com','9691669473','2023-12-13 05:13:52'),(12,8,'123456789987','AAAAA1234A','udaymourya921@gmail.com','9691669473','2023-12-14 07:46:09'),(13,8,'','','','','2023-12-18 05:08:33');
/*!40000 ALTER TABLE `unblock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `updationrequest`
--

DROP TABLE IF EXISTS `updationrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `updationrequest` (
  `Updationid` int NOT NULL AUTO_INCREMENT,
  `Acc_number` int NOT NULL,
  `Updation_type` varchar(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Father_Name` varchar(20) NOT NULL,
  `Mother_Name` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `DOB` varchar(15) NOT NULL,
  `marital` varchar(15) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Mobile` varchar(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `pincode` varchar(10) NOT NULL,
  `nominee_name` varchar(30) NOT NULL,
  `nominee_Father` varchar(30) NOT NULL,
  `nominee_mobile` varchar(10) NOT NULL,
  `nominee_email` varchar(30) NOT NULL,
  `nominee_Aadhar` varchar(12) NOT NULL,
  PRIMARY KEY (`Updationid`),
  KEY `Account_num_idx` (`Acc_number`),
  CONSTRAINT `FK_Account_Num` FOREIGN KEY (`Acc_number`) REFERENCES `account` (`Account_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `updationrequest`
--

LOCK TABLES `updationrequest` WRITE;
/*!40000 ALTER TABLE `updationrequest` DISABLE KEYS */;
INSERT INTO `updationrequest` VALUES (8,8,'FatherName','uday','dggdg','hdhhd','Male','2023-12-14','Single','udaymourya921@gmail.com','9691669473','33','indore','indore','Madhya Pradesh','636363','pppp','rrrr','09691669','udaymourya921@gmail.com','777887'),(9,8,'FatherName','uday','mmama','mama','Male','2023-12-07','Single','udaymourya921@gmail.com','9691669473','33','indore','indore','Madhya Pradesh','636363','pppp','rrrr','9691669473','udaymourya921@gmail.com','777887888888');
/*!40000 ALTER TABLE `updationrequest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-11 17:21:30
