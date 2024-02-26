package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @Column(nullable = false)
    Long id;

    @Size(min = 2,message = "product name cannot be less than 2")
    String name;
    @NotBlank(message = "product amount cannot be empty")
    Integer amount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id",nullable = true)
    Measurment measure_type;// measure type like kg,litres,dona and etc

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    Category category_id;

    @OneToMany(mappedBy = "product_id")
    Set<ProductPrice> productPrices;

    @OneToMany(mappedBy = "product_id")
    Set<AcceptDocItem> acceptDocItems;

    String description;
}