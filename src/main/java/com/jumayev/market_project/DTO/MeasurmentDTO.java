package com.jumayev.market_project.DTO;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MeasurmentDTO {
    Long id;
    String name;
}
