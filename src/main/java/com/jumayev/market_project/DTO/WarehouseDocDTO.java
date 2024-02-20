package com.jumayev.market_project.DTO;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.management.loading.PrivateClassLoader;
import java.lang.reflect.Field;
import java.time.LocalDate;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WarehouseDocDTO {
    Long id;
    Integer doc_number;
    LocalDate date;
}
