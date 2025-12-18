package com.ekim.tutoring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekim.tutoring.services.TutorService;

@RestController
@RequestMapping('/tutors')
public class UserController {
    @Autowired
    private TutorService tutorService;

    @GetMapping(value='/{tutorUser}')
    public ResponseEntity<Tutor> getTutorDetails(@PathVariable String tutorUser) {
        Tutor person = tutorService.
    }

}
