package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.ReturnDocDTO;
import com.jumayev.market_project.ENTITIES.ReturnDoc;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ReturnDocMapper extends EntyMapper<ReturnDocDTO,ReturnDoc> {
}
