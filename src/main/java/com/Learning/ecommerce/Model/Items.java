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
@Table(name = "Items_info")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Items {
    // Normal Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int item_id;
    int requiredQty;

    // Cardinality Relationship
    @ManyToOne
    @JoinColumn
    Product product;

    @ManyToOne
    @JoinColumn
    Orders order;

    @ManyToOne
    @JoinColumn
    Cart cart;

}
