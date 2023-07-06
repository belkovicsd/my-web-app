package com.belkovicsd.myproject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@Table
public class Product {

        @Id
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "product_sequence"
        )
        @SequenceGenerator(
                name = "product_sequence",
                sequenceName = "product_sequence",
                allocationSize = 1
        )
        private Long id;
        private String name;
        private Color color;
        private Size size;
        private Type type;
        private Double price;

}