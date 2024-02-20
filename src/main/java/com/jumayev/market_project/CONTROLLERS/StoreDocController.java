package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.StoreDocDTO;
import com.jumayev.market_project.SERVICES.classes.StoreDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("home/storedoc")
public class StoreDocController implements EntyController<StoreDocDTO>{
    private final StoreDocService service;

    @Override
    public List<StoreDocDTO> getAll() {
        return service.getAll();
    }

    @Override
    public StoreDocDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public StoreDocDTO update(StoreDocDTO body) {
        return service.update(body.getId(),body);
    }

    @Override
    public StoreDocDTO create(StoreDocDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
