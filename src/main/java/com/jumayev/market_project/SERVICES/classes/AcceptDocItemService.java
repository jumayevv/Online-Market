package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.AcceptDocItemDTO;
import com.jumayev.market_project.ENTITIES.AcceptDocItem;
import com.jumayev.market_project.MAPPERS.classes.AcceptDocItemMapper;
import com.jumayev.market_project.REPOSITORIES.AcceptDocItemREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class AcceptDocItemService implements EntyService<AcceptDocItemDTO> {
    private final AcceptDocItemMapper mapper;
    private final AcceptDocItemREPO repository;

    @Override
    public AcceptDocItemDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<AcceptDocItemDTO> getAll() {
        return mapper.toDTOList(repository.findAll(Sort.by("id")));
    }

    @Override
    public AcceptDocItemDTO create(AcceptDocItemDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public AcceptDocItemDTO update(Long target, AcceptDocItemDTO info) {
        AcceptDocItem temp = repository.getReferenceById(target);
        temp.setPrice(info.getPrice());
        temp.setCount(info.getCount());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
