package com.ekim.tutoring.services;

import com.ekim.tutoring.models.Customer;
import com.ekim.tutoring.repositories.CustomerRepository;

import java.util.Optional;

public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer newCustomer) {
        customerRepository.save(newCustomer);
        return newCustomer;
    }

    public Optional<Customer> findCustomerByUser(String username) {
        Optional<Customer> foundCustomer = customerRepository.findByUser(username);
        return foundCustomer;
    }
}