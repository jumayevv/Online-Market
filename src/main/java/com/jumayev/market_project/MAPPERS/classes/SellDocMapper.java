package com.jumayev.market_project.MAPPERS.classes;


import com.jumayev.market_project.DTO.SellDocDTO;
import com.jumayev.market_project.ENTITIES.SellDoc;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface SellDocMapper extends EntyMapper<SellDocDTO, SellDoc> {
}
