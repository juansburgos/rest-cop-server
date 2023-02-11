package com.juansburgos.clients.products.orders.controller;

import com.juansburgos.clients.products.orders.entity.Product;
import com.juansburgos.clients.products.orders.service.ProductService;
import com.juansburgos.clients.products.orders.service.ProductServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    @GetMapping("/products")
    public Product getProduct(@RequestParam Long productId) {
        Optional<Product> product = productService.getProductById(productId);
        return product.orElse(null);
    }
}
