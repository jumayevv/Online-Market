package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "warehouse_document_items")
@Entity
public class WarehouseDItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id;

    @NotNull(message = "doc_id cannot be null")
    Integer doc_id;
    @NotNull(message = "store_product_id cannot be null")
    Integer store_product_id;
    @NotNull(message = "product_id cannot be null")
    Integer product_id;
    @NotNull(message = "count cannot be null")
    Integer count;
}
