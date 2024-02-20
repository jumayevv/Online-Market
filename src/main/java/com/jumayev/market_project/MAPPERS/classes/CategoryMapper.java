package com.jumayev.market_project.MAPPERS.classes;


import com.jumayev.market_project.DTO.CategoryDTO;
import com.jumayev.market_project.ENTITIES.Category;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CategoryMapper extends EntyMapper<CategoryDTO, Category> {

}
