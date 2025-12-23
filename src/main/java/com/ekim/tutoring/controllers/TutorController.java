package com.ekim.tutoring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekim.tutoring.models.Tutor;
import com.ekim.tutoring.services.TutorService;

@RestController
@RequestMapping("/tutors")
public class TutorController {
    @Autowired
    private TutorService tutorService;

    @GetMapping(value="/{tutorUser}")
    public ResponseEntity<Tutor> getTutorDetails(@PathVariable String tutorUser, @RequestBody Tutor tutor) {
        Optional<Tutor> foundTutor = tutorService.getTutorByUser(tutorUser);
        if (foundTutor.isPresent()) {
            return new ResponseEntity<>(foundTutor.get(), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    

}
