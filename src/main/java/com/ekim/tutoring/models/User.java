package com.ekim.tutoring.models;

import java.util.Date;
import java.util.List;
import jakarta.persistence.Id;

public class User {
    @Id 
    private String username;
    private String password;
    private String phoneNumber;
    private Date createdDate;
    private Date updatedDate;
    
    // username set as id
    public User(String username, String password, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public void setPhoneNumber(String newPhone) {
        this.phoneNumber = newPhone;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}