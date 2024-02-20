package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.OrganizationDTO;
import com.jumayev.market_project.SERVICES.classes.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("home/organization")
public class OrganizationController implements EntyController<OrganizationDTO> {
    private final OrganizationService service;

    @Override
    public List<OrganizationDTO> getAll() {
        return service.getAll();
    }

    @Override
    public OrganizationDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public OrganizationDTO update(OrganizationDTO body) {
        return service.update(body.getId(),body);
    }

    @Override
    public OrganizationDTO create(OrganizationDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
