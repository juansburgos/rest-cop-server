package com.juansburgos.clients.products.orders.service;

import com.juansburgos.clients.products.orders.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer saveCustomer(Customer customer);

    List<Customer> getCustomers();

    Optional<Customer> getCustomerById(Long customerId);

    List<Customer> getCustomersByNameContaining(String customerName);

    Customer getCustomerByEmail(String email);
}
