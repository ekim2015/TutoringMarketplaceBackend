package com.ekim.tutoring.repositories;

import java.sql.*;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ekim.tutoring.models.Customer;

@Repository 
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional<Customer> findByUser(String username);
    Optional<Customer> findByEmail(String email);
    Optional<Customer> findByNumber(String phoneNumber);
    Optional<List<Customer>> findByFirstAndLast(String firstName, String lastName);
}