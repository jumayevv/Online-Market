package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.AcceptDocItemDTO;
import com.jumayev.market_project.ENTITIES.AcceptDocItem;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AcceptDocItemMapper extends EntyMapper<AcceptDocItemDTO, AcceptDocItem> {

}
