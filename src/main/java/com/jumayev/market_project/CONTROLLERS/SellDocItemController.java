package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.SellDocItemDTO;
import com.jumayev.market_project.ENTITIES.SellDocItem;
import com.jumayev.market_project.SERVICES.classes.SellDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("/api/home/selldocitem")
public class SellDocItemController implements EntyController<SellDocItemDTO>{
    private final SellDocItemService service;
    @Override
    public List<SellDocItemDTO> getAll() {
        return service.getAll();
    }

    @Override
    public SellDocItemDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public SellDocItemDTO update(SellDocItemDTO body) {
        return service.update(body.getId(), body);
    }

    @Override
    public SellDocItemDTO create(SellDocItemDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
