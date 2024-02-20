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
@Table(name = "return_document_items")
@Entity
public class ReturnDocItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer return_doc_id;
    Integer store_doc_id;
    Integer count;

}
