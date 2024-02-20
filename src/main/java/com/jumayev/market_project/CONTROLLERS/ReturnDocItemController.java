package com.jumayev.market_project.CONTROLLERS;


import com.jumayev.market_project.DTO.ReturnDocItemDTO;
import com.jumayev.market_project.SERVICES.classes.ReturnDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("home/returndocitem")
public class ReturnDocItemController implements EntyController<ReturnDocItemDTO>{
    private final ReturnDocItemService service;

    @Override
    public List<ReturnDocItemDTO> getAll() {
        return service.getAll();
    }

    @Override
    public ReturnDocItemDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public ReturnDocItemDTO update(ReturnDocItemDTO body) {
        return service.update(body.getId(), body);
    }

    @Override
    public ReturnDocItemDTO create(ReturnDocItemDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
