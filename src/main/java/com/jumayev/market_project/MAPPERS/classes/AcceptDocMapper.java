package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.AcceptDocDTO;
import com.jumayev.market_project.ENTITIES.AcceptDoc;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AcceptDocMapper extends EntyMapper<AcceptDocDTO, AcceptDoc> {
}
