package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.ProductDTO;
import com.jumayev.market_project.ENTITIES.Product;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
@Component
public interface ProductMapper extends EntyMapper<ProductDTO, Product> {
}
