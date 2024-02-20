package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.ReturnDocItemDTO;
import com.jumayev.market_project.ENTITIES.ReturnDocItem;
import com.jumayev.market_project.MAPPERS.classes.ReturnDocItemMapper;
import com.jumayev.market_project.REPOSITORIES.ReturnDocItemREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class ReturnDocItemService implements EntyService<ReturnDocItemDTO> {
    private final ReturnDocItemREPO repository;
    private final ReturnDocItemMapper mapper;

    @Override
    public ReturnDocItemDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<ReturnDocItemDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public ReturnDocItemDTO create(ReturnDocItemDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public ReturnDocItemDTO update(Long target, ReturnDocItemDTO info) {
        ReturnDocItem temp = repository.getReferenceById(target);
        temp.setReturn_doc_id(info.getReturn_doc_id());
        temp.setCount(info.getCount());
        temp.setStore_doc_id(info.getStore_doc_id());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
