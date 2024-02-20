package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.WarehouseDocDTO;
import com.jumayev.market_project.SERVICES.classes.WarehouseDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("home/warehousedoc")
public class WarehouseDocController implements EntyController<WarehouseDocDTO>{
    private final WarehouseDocService service;

    @Override
    public List<WarehouseDocDTO> getAll() {
        return service.getAll();
    }

    @Override
    public WarehouseDocDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public WarehouseDocDTO update(WarehouseDocDTO body) {
        return service.update(body.getId(),body);
    }

    @Override
    public WarehouseDocDTO create(WarehouseDocDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
