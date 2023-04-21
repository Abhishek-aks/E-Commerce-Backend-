package com.Learning.ecommerce.Model;

import com.Learning.ecommerce.Enum.OrderStatus;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Orders_info")
public class Orders {
    // Normal Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int transactionId;
    private Date date;
    private int totalCost;
    //ENUMERATED ATTIBUTE
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

//    @Enumerated(EnumType.STRING)
//    String paymentType;

//    @Enumerated(EnumType.STRING)
//    String CardUsedForPayment;

    // Cardinality Relationship
    @OneToOne
    @JoinColumn
    private Customer customer;

    @OneToMany(mappedBy = "order")
    List<Items> item;

}
