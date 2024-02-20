package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.SellDocItemDTO;
import com.jumayev.market_project.ENTITIES.SellDocItem;
import com.jumayev.market_project.MAPPERS.classes.SellDocItemMapper;
import com.jumayev.market_project.REPOSITORIES.SellDocItemREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class SellDocItemService implements EntyService<SellDocItemDTO> {

    private final SellDocItemREPO repository;
    private final SellDocItemMapper mapper;

    @Override
    public SellDocItemDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<SellDocItemDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public SellDocItemDTO create(SellDocItemDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public SellDocItemDTO update(Long target, SellDocItemDTO info) {
        SellDocItem temp = repository.getReferenceById(target);
        temp.setSell_doc_id(info.getSell_doc_id());
        temp.setCount(info.getCount());
        temp.setPrice(info.getPrice());
        temp.setStore_product_id(info.getStore_product_id());
        return mapper.toDTO(repository.save(temp)) ;
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
