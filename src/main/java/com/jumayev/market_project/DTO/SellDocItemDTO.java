package com.jumayev.market_project.DTO;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.management.loading.PrivateClassLoader;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SellDocItemDTO {
    Long id;

    Integer sell_doc_id;
    Integer store_product_id;
    Integer count;
    Double price;
}
