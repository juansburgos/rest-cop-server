package com.juansburgos.clients.products.orders.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long productId;
    @NotBlank(message = "Please enter a name for the product.")
    private String productName;
    private String productDescription;
    @NotBlank(message = "Please enter a price for the product.")
    private String price;
}
