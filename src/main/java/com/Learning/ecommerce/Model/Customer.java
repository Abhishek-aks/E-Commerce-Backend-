package com.Learning.ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data       //comprising features - @ToString, @EqualsAndHashCode, @Getter/@Setter & @RequiredArgsConstructor(ALL-in-1)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Customer_info")
public class Customer {
    // Normal Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String mobileNo;
    private String email;

    // Cardinality Relationship
    @OneToOne(mappedBy = "customer")
    private Card card;

    @OneToOne(mappedBy = "customer")
    private Cart cart;

    @OneToMany(mappedBy = "customer")
    List<Orders> orders;

}
