package com.juansburgos.clients.products.orders.controller;

import com.juansburgos.clients.products.orders.entity.Customer;
import com.juansburgos.clients.products.orders.entity.Order;
import com.juansburgos.clients.products.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping
    public Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getOrders();
    }
}
