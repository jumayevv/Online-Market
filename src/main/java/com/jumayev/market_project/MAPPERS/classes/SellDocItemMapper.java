package com.jumayev.market_project.MAPPERS.classes;


import com.jumayev.market_project.DTO.SellDocItemDTO;
import com.jumayev.market_project.ENTITIES.SellDocItem;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface SellDocItemMapper extends EntyMapper<SellDocItemDTO, SellDocItem> {
}
