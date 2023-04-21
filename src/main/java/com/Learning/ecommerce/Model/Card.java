package com.Learning.ecommerce.Model;

import com.Learning.ecommerce.Enum.CardType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Card_info")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {
    // Normal Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int card_id;
    int cardNo;
    int cvv;
    Date expiryDate;

    //ENUMERATED ATTIBUTE
    CardType type;
    // Cardinality Relationship
    @OneToOne
    @JoinColumn
    Customer customer;
}
