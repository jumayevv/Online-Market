package com.jumayev.market_project.MAPPERS.classes;


import com.jumayev.market_project.DTO.WarehouseDocDTO;
import com.jumayev.market_project.ENTITIES.WarehouseDoc;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface WarehouseDocMapper extends EntyMapper<WarehouseDocDTO, WarehouseDoc> {
}
