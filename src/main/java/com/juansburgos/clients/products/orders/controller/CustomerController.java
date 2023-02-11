package com.juansburgos.clients.products.orders.controller;

import com.juansburgos.clients.products.orders.entity.Customer;
import com.juansburgos.clients.products.orders.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
    @GetMapping("/customers")
    public Customer getCustomerById(@RequestParam Long customerId) {
        Optional<Customer> customer = customerService.getCustomerById(customerId);
        return customer.orElse(null);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomersByNameContaining(@RequestParam String customerName) {
        return customerService.getCustomersByNameContaining(customerName);
    }

    @GetMapping("/customers")
    public Customer getCustomerByEmail(@RequestParam String email) {
        return customerService.getCustomerByEmail(email);
    }
}
