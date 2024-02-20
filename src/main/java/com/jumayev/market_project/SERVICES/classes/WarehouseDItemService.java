package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.WarehouseDItemDTO;
import com.jumayev.market_project.ENTITIES.WarehouseDItem;
import com.jumayev.market_project.MAPPERS.classes.WarehouseDItemMapper;
import com.jumayev.market_project.REPOSITORIES.WarehouseDItemREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class WarehouseDItemService implements EntyService<WarehouseDItemDTO> {
    private final WarehouseDItemREPO repository;
    private final WarehouseDItemMapper mapper;

    @Override
    public WarehouseDItemDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<WarehouseDItemDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public WarehouseDItemDTO create(WarehouseDItemDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public WarehouseDItemDTO update(Long target, WarehouseDItemDTO info) {
        WarehouseDItem temp = repository.getReferenceById(target);
        temp.setCount(info.getCount());
        temp.setDoc_id(info.getDoc_id());
        temp.setProduct_id(info.getProduct_id());
        temp.setStore_product_id(info.getStore_product_id());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {

    }
}
