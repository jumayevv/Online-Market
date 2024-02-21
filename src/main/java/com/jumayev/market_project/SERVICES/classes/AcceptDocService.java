package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.AcceptDocDTO;
import com.jumayev.market_project.ENTITIES.AcceptDoc;
import com.jumayev.market_project.MAPPERS.classes.AcceptDocMapper;
import com.jumayev.market_project.REPOSITORIES.AcceptDocREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class AcceptDocService implements EntyService<AcceptDocDTO> {
    private final AcceptDocREPO repository;
    private final AcceptDocMapper mapper;

    @Override
    public AcceptDocDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<AcceptDocDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public AcceptDocDTO create(AcceptDocDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public AcceptDocDTO update(Long target, AcceptDocDTO info) {
        AcceptDoc temp = repository.getReferenceById(target);
        temp.setDate(info.getDate());
        temp.setDoc_number(info.getDoc_number());
        temp.setOrganization_id(info.getOrganization_id());

        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
