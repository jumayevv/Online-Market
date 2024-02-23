package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "doc_number",nullable = false)
    WarehouseDoc doc_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "product_id",nullable = false)
    StoreProduct store_product_id;

    @NotNull(message = "product_id cannot be null")

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id",nullable = false)
    Product product_id;
    @NotNull(message = "count cannot be null")
    Integer count;
}
