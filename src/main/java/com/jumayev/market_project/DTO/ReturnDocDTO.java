package com.jumayev.market_project.DTO;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReturnDocDTO {
    Long id;
    Integer doc_number;
    LocalDate date;

}
