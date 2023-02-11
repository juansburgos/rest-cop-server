package com.juansburgos.clients.products.orders.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "order_t")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long orderId;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "customer_id",
            referencedColumnName = "customerId"
    )
    private Customer customer;
    private String comment;
    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "order_product_map",
            joinColumns = @JoinColumn(
                    name = "order_id",
                    referencedColumnName = "orderId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "product_id",
                    referencedColumnName = "productId"
            )
    )
    private List<Product> products;

    public void addProducts(Product product) {
        if(products == null) products = new ArrayList<>();
        products.add(product);
    }
}
