package com.jumayev.market_project.MAPPERS.classes;

import com.jumayev.market_project.DTO.MeasurmentDTO;
import com.jumayev.market_project.ENTITIES.Measurment;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring") @Component
public interface MeasurmentMapper extends EntyMapper<MeasurmentDTO, Measurment> {
}
