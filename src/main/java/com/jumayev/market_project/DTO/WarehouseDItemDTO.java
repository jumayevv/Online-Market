package com.jumayev.market_project.DTO;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WarehouseDItemDTO {
    Long id;
    Integer doc_id;
    Integer store_product_id;
    Integer product_id;
    Integer count;
}
