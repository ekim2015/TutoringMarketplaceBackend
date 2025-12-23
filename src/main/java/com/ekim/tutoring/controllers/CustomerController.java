package com.ekim.tutoring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekim.tutoring.models.Customer;
import com.ekim.tutoring.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value="/{customerUser}")
    public ResponseEntity<Customer> getCustomerDetails(@PathVariable String customerUser) {
        Optional<Customer> foundCustomer = customerService.findCustomerByUser(customerUser);
        if (foundCustomer != null) {
            return new ResponseEntity<>(foundCustomer.get(), HttpStatus.FOUND);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
