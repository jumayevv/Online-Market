package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "products")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Size(min = 2,message = "product name cannot be less than 2")
    String name;

    Integer amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id",nullable = true)
    Measurment measure_type;// o'lchov birligi (kg,litr,dona va hokazo)

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    Category category_id;

    String description;


    @OneToMany(mappedBy = "product_id")
    Set<ProductPrice> productPrices;

    @OneToMany(mappedBy = "product_id")
    Set<AcceptDocItem> acceptDocItems;
}
