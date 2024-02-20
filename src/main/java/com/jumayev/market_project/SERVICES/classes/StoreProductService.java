package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.StoreProductDTO;
import com.jumayev.market_project.ENTITIES.StoreProduct;
import com.jumayev.market_project.MAPPERS.classes.StoreProductMapper;
import com.jumayev.market_project.REPOSITORIES.StoreProductREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class StoreProductService implements EntyService<StoreProductDTO> {
    private final StoreProductMapper mapper;
    private final StoreProductREPO repository;

    @Override
    public StoreProductDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<StoreProductDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public StoreProductDTO create(StoreProductDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public StoreProductDTO update(Long target, StoreProductDTO info) {
        StoreProduct temp = repository.getReferenceById(target);
        temp.setProduct_id(info.getProduct_id());
        temp.setAmount(info.getAmount());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
