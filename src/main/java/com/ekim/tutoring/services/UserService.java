package com.ekim.tutoring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekim.tutoring.repositories.UserRepository;

// solely used for registration and login
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
}