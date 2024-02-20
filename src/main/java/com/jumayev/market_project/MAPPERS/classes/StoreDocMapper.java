package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.StoreDocDTO;
import com.jumayev.market_project.ENTITIES.StoreDoc;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface StoreDocMapper extends EntyMapper<StoreDocDTO, StoreDoc> {
}
