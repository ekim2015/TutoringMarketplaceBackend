package com.ekim.tutoring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekim.tutoring.models.User;
import com.ekim.tutoring.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // check if registered?
    @PostMapping(value="/{username}")
    public ResponseEntity<User> registerUser(@PathVariable String username) {

    }

    @PostMapping(value="/{username}")
    public ResponseEntity<User> loginUser(@PathVariable String username) {
        
    }

}
