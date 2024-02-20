package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.ReturnDocDTO;
import com.jumayev.market_project.ENTITIES.ReturnDoc;
import com.jumayev.market_project.MAPPERS.classes.AcceptDocItemMapper;
import com.jumayev.market_project.MAPPERS.classes.ReturnDocMapper;
import com.jumayev.market_project.REPOSITORIES.AcceptDocItemREPO;
import com.jumayev.market_project.REPOSITORIES.ReturnDocREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class ReturnDocService implements EntyService<ReturnDocDTO> {
    private final ReturnDocREPO repository;
    private final ReturnDocMapper mapper;

    @Override
    public ReturnDocDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<ReturnDocDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public ReturnDocDTO create(ReturnDocDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public ReturnDocDTO update(Long target, ReturnDocDTO info) {
        ReturnDoc temp = repository.getReferenceById(target);
        temp.setDate(info.getDate());
        temp.setDoc_number(info.getDoc_number());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
