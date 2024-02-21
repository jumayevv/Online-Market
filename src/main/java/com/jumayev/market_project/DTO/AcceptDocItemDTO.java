package com.jumayev.market_project.DTO;


import com.jumayev.market_project.ENTITIES.Product;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AcceptDocItemDTO {

    Long id;
    Integer document_id;
    Product product_id;
    Double price;
    Integer count;
}
