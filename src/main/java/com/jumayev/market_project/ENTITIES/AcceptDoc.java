package com.jumayev.market_project.ENTITIES;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

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
    @NotNull
    Integer doc_number;
    @NotNull
    Integer organization_id;

    LocalDate date = LocalDate.now();
}
