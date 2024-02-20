package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.WarehouseDocDTO;
import com.jumayev.market_project.ENTITIES.WarehouseDoc;
import com.jumayev.market_project.MAPPERS.classes.WarehouseDocMapper;
import com.jumayev.market_project.REPOSITORIES.WarehouseDocREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class WarehouseDocService implements EntyService<WarehouseDocDTO> {
    private final WarehouseDocREPO repository;
    private final WarehouseDocMapper mapper;

    @Override
    public WarehouseDocDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<WarehouseDocDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public WarehouseDocDTO create(WarehouseDocDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public WarehouseDocDTO update(Long target, WarehouseDocDTO info) {
        WarehouseDoc temp = repository.getReferenceById(target);
        temp.setDate(info.getDate());
        temp.setDoc_number(info.getDoc_number());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {

    }
}
