package com.Learning.ecommerce.Model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cart_info")
@FieldDefaults(level = AccessLevel.PRIVATE) // privateised the all Attributes
public class Cart {
    // Normal Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cart_id;
    int cartTotal;

    // Cardinality Relationship
    @OneToOne
    Customer customer;

}
