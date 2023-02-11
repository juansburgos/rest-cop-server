package com.juansburgos.clients.products.orders.repository;

import com.juansburgos.clients.products.orders.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByNameContaining(String customerName);

    Customer findByEmail(String email);
}
