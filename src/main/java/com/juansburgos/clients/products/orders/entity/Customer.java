package com.juansburgos.clients.products.orders.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long customerId;
    @NotBlank(message = "Please enter the client's name")
    private String name;
    @Email(message = "Please enter a valid email address")
    private String email;
    @NotBlank(message = "Please enter a phone number")
    private String phoneNumber;
}
