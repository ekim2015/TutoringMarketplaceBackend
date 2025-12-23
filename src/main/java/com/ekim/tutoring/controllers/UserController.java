package com.ekim.tutoring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekim.tutoring.models.User;
import com.ekim.tutoring.services.UserService;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;

    // @RequestBody means request body turned into User type
    @PostMapping(value="/register")
    public ResponseEntity<User> registerUser(@RequestBody User newUser) {
        userService.createUser(newUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // log into a session
    @PostMapping(value="/login")
    public ResponseEntity<User> loginUser(@RequestBody User newUser) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
