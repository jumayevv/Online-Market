package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Builder
@RequiredArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "store_document_items")
@Entity
public class StoreDocItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id;
    @NotNull(message = "doc_id cannot be null")
    Integer doc_id;
    @NotNull(message = "produtc_id cannot be null")
    Integer product_id;
    @NotNull(message = "count cannot be null")
    Integer count;

}
