package com.juansburgos.clients.products.orders.service;

import com.juansburgos.clients.products.orders.entity.Customer;
import com.juansburgos.clients.products.orders.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplementation implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    @Override
    public Optional<Customer> getCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public List<Customer> getCustomersByNameContaining(String customerName) {
        return customerRepository.findByNameContaining(customerName);
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public void deleteCustomerById(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
