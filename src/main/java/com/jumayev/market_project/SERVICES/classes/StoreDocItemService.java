package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.StoreDocItemDTO;
import com.jumayev.market_project.ENTITIES.StoreDocItem;
import com.jumayev.market_project.MAPPERS.classes.StoreDocItemMapper;
import com.jumayev.market_project.REPOSITORIES.StoreDocItemREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class StoreDocItemService implements EntyService<StoreDocItemDTO> {
    private final StoreDocItemREPO repository;
    private final StoreDocItemMapper mapper;

    @Override
    public StoreDocItemDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<StoreDocItemDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public StoreDocItemDTO create(StoreDocItemDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public StoreDocItemDTO update(Long target, StoreDocItemDTO info) {
        StoreDocItem temp = repository.getReferenceById(target);
        temp.setDoc_id(info.getDoc_id());
        temp.setCount(info.getCount());
        temp.setProduct_id(info.getProduct_id());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
