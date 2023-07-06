package com.belkovicsd.myproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
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
        private List<Color> color;
        private List<Size> size;
        private Type type;
        private Double price;

}