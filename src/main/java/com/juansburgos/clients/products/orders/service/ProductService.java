package com.juansburgos.clients.products.orders.service;

import com.juansburgos.clients.products.orders.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> getProducts();

    Optional<Product> getProductById(Long productId);
}
