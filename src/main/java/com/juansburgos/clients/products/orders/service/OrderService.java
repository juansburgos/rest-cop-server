package com.juansburgos.clients.products.orders.service;

import com.juansburgos.clients.products.orders.entity.Order;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);

    List<Order> getOrders();
}
