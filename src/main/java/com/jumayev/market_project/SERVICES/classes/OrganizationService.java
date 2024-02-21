package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.OrganizationDTO;
import com.jumayev.market_project.ENTITIES.Organization;
import com.jumayev.market_project.MAPPERS.classes.OrganizationMapper;
import com.jumayev.market_project.REPOSITORIES.OrganizationREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class OrganizationService implements EntyService<OrganizationDTO> {
    private final OrganizationREPO repository;
    private final OrganizationMapper mapper;

    @Override
    public OrganizationDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<OrganizationDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public OrganizationDTO create(OrganizationDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public OrganizationDTO update(Long target, OrganizationDTO info) {
        Organization temp = repository.getReferenceById(target);
        temp.setName(info.getName());
        temp.setAddress(info.getAddress());
        temp.setPhone_number(info.getPhone_number());

        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
