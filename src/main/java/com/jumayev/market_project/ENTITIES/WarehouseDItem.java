package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Builder
@RequiredArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "warehouse_document_items")
@Entity
public class WarehouseDItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer doc_id;
    Integer store_product_id;
    Integer product_id;
    Integer count;
}
