package com.juansburgos.clients.products.orders.controller;

import com.juansburgos.clients.products.orders.entity.Customer;
import com.juansburgos.clients.products.orders.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
    @GetMapping(params = "customerId")
    public Customer getCustomerById(@RequestParam Long customerId) {
        Optional<Customer> customer = customerService.getCustomerById(customerId);
        return customer.orElse(null);
    }
    @GetMapping(params = "customerName")
    public List<Customer> getCustomersByNameContaining(@RequestParam String customerName) {
        return customerService.getCustomersByNameContaining(customerName);
    }
    @GetMapping(params = "email")
    public Customer getCustomerByEmail(@RequestParam String email) {
        return customerService.getCustomerByEmail(email);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @DeleteMapping(params = "customerId")
    public String deleteCustomerById(@RequestParam Long customerId) {
        customerService.deleteCustomerById(customerId);
        return "Deleted successfully";
    }
}