package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "accept_documents")
@Entity
public class AcceptDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "id")
    Set<AcceptDocItem> items;
    @NotNull(message = "doc number cannot be null")
    Integer doc_number;
    @NotNull(message = "organization id cannot be null")
    Integer organization_id;
    LocalDate date = LocalDate.now();
}
