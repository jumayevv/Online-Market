package com.jumayev.market_project.MAPPERS.classes;


import com.jumayev.market_project.DTO.StoreDocItemDTO;
import com.jumayev.market_project.ENTITIES.StoreDocItem;
import com.jumayev.market_project.MAPPERS.EntyMapper;
import org.hibernate.usertype.EnhancedUserType;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface StoreDocItemMapper extends EntyMapper<StoreDocItemDTO, StoreDocItem> {
}
