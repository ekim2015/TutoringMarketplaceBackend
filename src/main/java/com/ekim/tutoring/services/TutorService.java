package com.ekim.tutoring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.ekim.tutoring.models.Tutor;
import com.ekim.tutoring.repositories.TutorRepository;

// service methods revolve around updating, deleting, creating, and 

@Service
public class TutorService {
    @Autowired
    private TutorRepository tutorRepository;

    public void createTutor(Tutor newTutor) {
        tutorRepository.save(newTutor);
    }

    // should only be admin who can do this
    @PreAuthorize("hasRole('admin')")
    public List<Tutor> getAllTutors() throws Exception {
        Iterable<Tutor> res = tutorRepository.findAll();
        List<Tutor> tutors = new ArrayList<Tutor>();
        res.forEach(tutors::add);

        if (tutors.isEmpty()) {
            throw new Exception("No tutors have been found.");
        }

        return tutors;
    } 

    public Optional<Tutor> getTutorByUser(String username) {
        Optional<Tutor> foundTutor = tutorRepository.findByUser(username);
        return foundTutor;
    }

    // only can be done by account owner or admin
    public void deleteTutorByUser(String user) throws IllegalArgumentException {
        Optional<Tutor> foundTutor = tutorRepository.findByUser(user);

        if (foundTutor.isPresent()) {
            tutorRepository.delete(foundTutor.get());
        } else {
            throw new IllegalArgumentException("No tutor can be deleted!");
        }
    }

}