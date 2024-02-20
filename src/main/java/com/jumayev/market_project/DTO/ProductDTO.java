package com.jumayev.market_project.DTO;

import com.jumayev.market_project.ENTITIES.Category;
import com.jumayev.market_project.ENTITIES.Measurment;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDTO {
    Long id;
    String name;
    Integer amount;
    Category category_id;
    Measurment measure_type;// o'lchov birligi (kg,litr,dona va hokazo)
    String description;



}
