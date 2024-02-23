package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "store_documents")
@Entity
public class StoreDoc{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id;
    @NotNull(message = "doc number cannot be null")
    @OneToMany(mappedBy = "doc_id")
    Set<StoreDocItem> doc_number;
    LocalDate date = LocalDate.now(); // default value is date time now
}
