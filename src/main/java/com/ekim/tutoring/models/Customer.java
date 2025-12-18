package com.ekim.tutoring.models;

import java.util.List;
import jakarta.persistence.Id;

import com.ekim.tutoring.models.Tutor;
import com.ekim.tutoring.models.User;

// customer = parent or student looking for tutor
public class Customer {
    private String blurb;
    private int age;
    private List<String> topics;
    private List<Tutor> tutoringHistory;
    private List<String> subjects;
    
    // needs to be connected to a user
    private User connectedUser;

    public String getBlurb() {
        return blurb;
    }
    
    public int getAge() {
        return age;
    }

    public List<String> getTopics() {
        return topics;
    }
}