package com.jumayev.market_project.ENTITIES;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "categories")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id;

    @NotBlank(message = "category name cannot be empty")
    @Size(min = 2,message = "category name cannot be less than 2")
    String name;

    @OneToMany(mappedBy = "category_id")
    Set<Product> products;

}