import java.sql.Timestamp;

public class ReportDTO {
    private int reportId;
    private int accNumber;
    private String reportType;
    private String reportStatus;
    private String reportSolution;
    private String reportMessage;
    private Timestamp reportDate;

    // Constructors

    public ReportDTO() {
        // Default constructor
    }

    // Parameterized constructor if needed

    // Getters and setters

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getReportSolution() {
        return reportSolution;
    }

    public void setReportSolution(String reportSolution) {
        this.reportSolution = reportSolution;
    }

    public String getReportMessage() {
        return reportMessage;
    }

    public void setReportMessage(String reportMessage) {
        this.reportMessage = reportMessage;
    }

    public Timestamp getReportDate() {
        return reportDate;
    }

    public void setReportDate(Timestamp reportDate) {
        this.reportDate = reportDate;
    }
}



CREATE TABLE `Transaction_Information` (
  `Transaction_id` int NOT NULL AUTO_INCREMENT,
  `sender_id` int NOT NULL,
  `Receiver_Id` int NOT NULL,
  `Amount` varchar(25) NOT NULL,
  `Tran_Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Tran_Type` varchar(10) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Tran_status` varchar(10) NOT NULL,
   PRIMARY KEY (`Transaction_id`),
  KEY `Receiver_Id_idx` (`Receiver_Id`),
  KEY `sender_idx` (`sender_id`),
  CONSTRAINT `Receiver_Id` FOREIGN KEY (`Receiver_Id`) REFERENCES `Beneficiary` (`Beneficiary_Id`),
  CONSTRAINT `sender_id` FOREIGN KEY (`sender_id`) REFERENCES `customer` (`customerid`)
  ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

    CREATE TABLE Unblock (
    Unblock_id int NOT NULL AUTO_INCREMENT,
    Acc_number int NOT NULL,
    Adhar varchar(12) NOT NULL,
    Pan varchar(10)NOT NULL ,
    Email VARCHAR(30) NOT NULL,
    Mobile VARCHAR(10) NOT NULL,
    Unlockreq date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    
    PRIMARY KEY (Unblock_id),
    KEY Acc_number_idx (Acc_number),
    CONSTRAINT Acc_number FOREIGN KEY (Acc_number) REFERENCES Account (Account_Num),
  ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
   



CREATE TABLE `Transaction_Information` (
  `Transaction_id` int NOT NULL  AUTO_INCREMENT,
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
  CONSTRAINT `Receiver_Acc_num` FOREIGN KEY (`Receiver_Acc_num`) REFERENCES `Beneficiary` (`Account_Num`),
  CONSTRAINT `sender_Acc` FOREIGN KEY (`sender_Acc`) REFERENCES `Account` (`Account_Num`)
  ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




  CREATE TABLE Unblock (
    Unblock_id INT NOT NULL AUTO_INCREMENT,
    Acc_number INT NOT NULL ,
    Adhar VARCHAR(12) NOT NULL,
    Pan VARCHAR(10) NOT NULL,
    Email VARCHAR(30) NOT NULL,
    Mobile VARCHAR(10) NOT NULL,
    Unlockreq TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    
    PRIMARY KEY (Unblock_id),
    KEY Acc_number_idx (Acc_number),
    CONSTRAINT Acc_number FOREIGN KEY (Acc_number) REFERENCES Account (Account_Num)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



package com.swastik.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BeneficiaryDao {
    // ... (other existing methods)

    // Add this method for deleting a beneficiary
    public static boolean deleteBeneficiary(int accNum) {
        try {
            Connection con = ConnectionProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM Beneficiary WHERE AccNum = ?");
            ps.setInt(1, accNum);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

insert into transaction_information (sender_id,Receiver_Id,Amount,Tran_Type,Description,Tran_status) values (1001,1001,'2004','Neft','hello','done');