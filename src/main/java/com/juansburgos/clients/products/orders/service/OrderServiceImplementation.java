package com.juansburgos.clients.products.orders.service;

import com.juansburgos.clients.products.orders.entity.Order;
import com.juansburgos.clients.products.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
