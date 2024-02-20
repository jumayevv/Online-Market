package com.jumayev.market_project.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AcceptDocDTO {
    Long id;
    @NotNull
    Integer doc_number;
    @NotNull
    Integer organization_id;
    LocalDate date;
}
