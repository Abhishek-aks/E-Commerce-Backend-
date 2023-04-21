package com.Learning.ecommerce.Model;

import com.Learning.ecommerce.Enum.Category;
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
@Table(name = "Product_info")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    // Normal Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
//    int warrenty;
    int quantity;
    int price;

    //ENUMERATED ATTIBUTE
    @Enumerated(EnumType.STRING)
    Category category;

    // Cardinality Relationship
    @ManyToOne
    @JoinColumn
    Seller seller;

    @ManyToOne
    @JoinColumn
    Items item;

}
