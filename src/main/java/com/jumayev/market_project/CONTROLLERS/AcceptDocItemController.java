package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.AcceptDocItemDTO;
import com.jumayev.market_project.SERVICES.classes.AcceptDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("/home/acceptdocitem")
public class AcceptDocItemController implements EntyController<AcceptDocItemDTO> {
    private final AcceptDocItemService service;

    @Override
    public List<AcceptDocItemDTO> getAll() {
        return service.getAll();
    }

    @Override
    public AcceptDocItemDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public AcceptDocItemDTO update(AcceptDocItemDTO body) {
        return service.update(body.getId(),body);
    }

    @Override
    public AcceptDocItemDTO create(AcceptDocItemDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
