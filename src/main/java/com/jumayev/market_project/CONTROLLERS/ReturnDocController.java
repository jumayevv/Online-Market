package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.ReturnDocDTO;
import com.jumayev.market_project.SERVICES.classes.ReturnDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("/api/home/returndoc")
public class ReturnDocController implements EntyController<ReturnDocDTO> {
    private final ReturnDocService service;

    @Override
    public List<ReturnDocDTO> getAll() {
        return service.getAll();
    }

    @Override
    public ReturnDocDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public ReturnDocDTO update(ReturnDocDTO body) {
        return service.update(body.getId(), body);
    }

    @Override
    public ReturnDocDTO create(ReturnDocDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
