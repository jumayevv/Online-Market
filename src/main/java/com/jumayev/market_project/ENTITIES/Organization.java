package com.jumayev.market_project.ENTITIES;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "organizations")
@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id;
    @NotNull(message = "organization name cannot be null")
    String name;
    @NotNull(message = "address cannot be null")
    String address;

    @Size(min = 7,max = 15,message = "phone number length should be between 7 and 15")
    String phone_number;

    }
