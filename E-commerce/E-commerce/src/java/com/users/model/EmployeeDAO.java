
package com.users.model;

public class EmployeeDAO {
    int id;
    String name,fname,email,password,contact;
    
    public EmployeeDAO() {
    }
    
    public EmployeeDAO(int id, String name, String fname, String email, String password, String contact) {
        this.id = id;
        this.name = name;
        this.fname = fname;
        this.email = email;
        this.password = password;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    
    
}
