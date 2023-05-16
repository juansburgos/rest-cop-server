package com.juansburgos.clients.products.orders.repository;

import com.juansburgos.clients.products.orders.entity.Customer;
import com.juansburgos.clients.products.orders.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
