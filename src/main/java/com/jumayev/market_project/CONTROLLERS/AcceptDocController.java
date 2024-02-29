package com.jumayev.market_project.CONTROLLERS;


import com.jumayev.market_project.DTO.AcceptDocDTO;
import com.jumayev.market_project.SERVICES.classes.AcceptDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("/api/home/acceptdoc")
public class AcceptDocController implements EntyController<AcceptDocDTO> {
    private final AcceptDocService service;

    @Override
    public List<AcceptDocDTO> getAll() {
        return service.getAll();
    }

    @Override
    public AcceptDocDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public AcceptDocDTO update(AcceptDocDTO body) {
        return service.update(body.getId(),body);
    }

    @Override
    public AcceptDocDTO create(AcceptDocDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
