package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.SellDocDTO;
import com.jumayev.market_project.ENTITIES.SellDoc;
import com.jumayev.market_project.MAPPERS.classes.SellDocMapper;
import com.jumayev.market_project.REPOSITORIES.SellDocREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class SellDocService implements EntyService<SellDocDTO> {
    private final SellDocREPO repository;
    private final SellDocMapper mapper;

    @Override
    public SellDocDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<SellDocDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public SellDocDTO create(SellDocDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public SellDocDTO update(Long target, SellDocDTO info) {
        SellDoc temp = repository.getReferenceById(target);
        temp.setDate(info.getDate());
        temp.setDoc_number(info.getDoc_number());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
