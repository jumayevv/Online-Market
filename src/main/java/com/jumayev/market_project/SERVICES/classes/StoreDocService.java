package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.StoreDocDTO;
import com.jumayev.market_project.ENTITIES.StoreDoc;
import com.jumayev.market_project.MAPPERS.classes.StoreDocMapper;
import com.jumayev.market_project.REPOSITORIES.StoreDocREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class StoreDocService implements EntyService<StoreDocDTO> {
    private final StoreDocREPO repository;
    private final StoreDocMapper mapper;

    @Override
    public StoreDocDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<StoreDocDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public StoreDocDTO create(StoreDocDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public StoreDocDTO update(Long target, StoreDocDTO info) {
        StoreDoc temp = repository.getReferenceById(target);
        temp.setDate(info.getDate());
        temp.setDoc_number(info.getDoc_number());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
