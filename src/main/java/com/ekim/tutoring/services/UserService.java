package com.ekim.tutoring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ekim.tutoring.models.User;
import com.ekim.tutoring.repositories.UserRepository;

// solely used for registration and login
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(User newUser) {
        String newPassword = new BCryptPasswordEncoder().encode(newUser.getPassword());
        
        User registeredUser = new User(newUser.getUsername(), newPassword, newUser.getPhoneNumber());
        userRepository.save(registeredUser);
    }


    
}