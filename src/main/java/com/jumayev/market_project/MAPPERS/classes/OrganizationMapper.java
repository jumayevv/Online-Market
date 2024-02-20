package com.jumayev.market_project.MAPPERS.classes;


import com.jumayev.market_project.DTO.OrganizationDTO;
import com.jumayev.market_project.ENTITIES.Organization;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring") @Component
public interface OrganizationMapper extends EntyMapper<OrganizationDTO, Organization> {
}
