package com.java.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private static final List<Customer> customers = List.of(
            new Customer(1L, "jhon", "doe", "sebas@gmail.com"));

    public List<Customer> findAllCustomers() {
        return customers;
    }

}
