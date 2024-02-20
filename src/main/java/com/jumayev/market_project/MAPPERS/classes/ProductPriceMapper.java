package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.ProductPriceDTO;
import com.jumayev.market_project.ENTITIES.ProductPrice;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import jakarta.persistence.metamodel.EntityType;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring") @Component
public interface ProductPriceMapper extends EntyMapper<ProductPriceDTO, ProductPrice> {
}
