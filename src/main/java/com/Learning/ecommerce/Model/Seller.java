package com.Learning.ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Seller_info")
public class Seller {
    // Normal Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String mobileNo;
    private String email;
    private String enterpriseName;

    // Cardinality Relationship
    @OneToMany(mappedBy = "seller")
    List<Product> product;
}
