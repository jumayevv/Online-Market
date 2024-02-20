package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.ReturnDocItemDTO;
import com.jumayev.market_project.ENTITIES.ReturnDocItem;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ReturnDocItemMapper extends EntyMapper<ReturnDocItemDTO,ReturnDocItem> {
}
