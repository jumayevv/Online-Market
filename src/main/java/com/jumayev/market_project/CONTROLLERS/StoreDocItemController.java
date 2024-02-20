package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.StoreDocItemDTO;
import com.jumayev.market_project.SERVICES.classes.StoreDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("home/storedocitem")
public class StoreDocItemController implements EntyController<StoreDocItemDTO>{
    private final StoreDocItemService service;

    @Override
    public List<StoreDocItemDTO> getAll() {
        return service.getAll();
    }

    @Override
    public StoreDocItemDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public StoreDocItemDTO update(StoreDocItemDTO body) {
        return service.update(body.getId(), body);
    }

    @Override
    public StoreDocItemDTO create(StoreDocItemDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
