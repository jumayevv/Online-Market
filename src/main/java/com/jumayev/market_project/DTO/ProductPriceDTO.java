package com.jumayev.market_project.DTO;

import com.jumayev.market_project.ENTITIES.Product;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductPriceDTO {
    Long id;
    Product product_id;
    Double price;
    LocalDate date = LocalDate.now();
    Boolean status=false;
}
