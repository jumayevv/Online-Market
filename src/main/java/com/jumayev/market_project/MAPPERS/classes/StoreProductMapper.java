package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.StoreProductDTO;
import com.jumayev.market_project.ENTITIES.StoreProduct;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
@Component
public interface StoreProductMapper extends EntyMapper<StoreProductDTO, StoreProduct> {
}
