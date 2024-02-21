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
@Table(name = "return_document_items")
@Entity
public class ReturnDocItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id;
    @NotNull(message = "return_doc_id cannot be null")
    Integer return_doc_id;
    @NotNull(message = "store_doc_id cannot be null")
    Integer store_doc_id;
    @NotNull(message = "count cannot be null")
    Integer count;

}
