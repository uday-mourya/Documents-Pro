package com.employee.model;

import java.io.Serializable;


public class employeeDAO implements Serializable {
    private int id;
    private String name, email,password,mobile,salary;

    public employeeDAO(String name, String email, String password, String mobile, String salary) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.salary = salary;
    }
    
   

    public employeeDAO() {
    }


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
   
    
     
}