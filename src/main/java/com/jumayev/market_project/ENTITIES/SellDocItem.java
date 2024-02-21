package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.aspectj.lang.annotation.DeclareAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Builder
@AllArgsConstructor
@NoArgsConstructor@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "sell_document_items")
@Entity
public class SellDocItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id;

    @NotNull(message = "sell_doc_id cannot be null")
    Integer sell_doc_id;
    @NotNull(message = "store_product_id cannot be null")
    Integer store_product_id;
    @NotNull(message = "count cannot be null")
    Integer count;
    @NotNull(message = "price cannot be null")
    Double price;

}
