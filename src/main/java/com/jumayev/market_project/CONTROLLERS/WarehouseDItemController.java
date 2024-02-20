package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.WarehouseDItemDTO;
import com.jumayev.market_project.SERVICES.classes.WarehouseDItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor @RestController @RequestMapping("home/warehouseditem")
public class WarehouseDItemController implements EntyController<WarehouseDItemDTO>{
    private final WarehouseDItemService service;

    @Override
    public List<WarehouseDItemDTO> getAll() {
        return service.getAll();
    }

    @Override
    public WarehouseDItemDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public WarehouseDItemDTO update(WarehouseDItemDTO body) {
        return service.update(body.getId(), body);
    }

    @Override
    public WarehouseDItemDTO create(WarehouseDItemDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
