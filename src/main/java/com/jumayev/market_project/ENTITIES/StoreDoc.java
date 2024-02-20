package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Builder
@RequiredArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "store_documents")
@Entity
public class StoreDoc{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer doc_number;
    LocalDate date = LocalDate.now();
}
