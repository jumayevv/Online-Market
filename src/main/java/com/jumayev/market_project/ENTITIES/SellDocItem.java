package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.aspectj.lang.annotation.DeclareAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Builder
@RequiredArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "sell_document_items")
@Entity
public class SellDocItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Integer sell_doc_id;
    Integer store_product_id;
    Integer count;
    Double price;

}
