package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "sell_document_items")
@Entity
public class ReturnDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id;
    @NotNull(message = "document number cannot be null")
    @OneToMany(mappedBy = "return_doc_id")
    Set<ReturnDocItem> doc_number;
    LocalDate date = LocalDate.now(); // default value is date time now

}
