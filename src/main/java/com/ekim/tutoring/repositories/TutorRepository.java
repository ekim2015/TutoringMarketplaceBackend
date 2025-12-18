package com.ekim.tutoring.repositories;

import java.sql.*;
import java.util.Optional;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ekim.tutoring.models.Tutor;

@Repository 
public interface TutorRepository extends CrudRepository<Tutor, Long> {
    Optional<Tutor> findByUser(String username);
    Optional<Tutor> findByEmail(String email);
    Optional<Tutor> findByNumber(String phoneNumber);
    Optional<List<Tutor>> findByFirstAndLast(String firstName, String lastName);
}