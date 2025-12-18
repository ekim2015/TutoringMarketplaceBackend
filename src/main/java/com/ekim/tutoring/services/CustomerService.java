package com.ekim.tutoring.services;

import com.ekim.tutoring.models.Customer;
import com.ekim.tutoring.repositories.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer newCustomer) {
        customerRepository.save(newCustomer);
        return newCustomer;
    }
}