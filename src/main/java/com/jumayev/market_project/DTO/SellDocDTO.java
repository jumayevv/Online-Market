package com.jumayev.market_project.DTO;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SellDocDTO {
    Long id;
    Integer doc_number;
    LocalDate date;
}
