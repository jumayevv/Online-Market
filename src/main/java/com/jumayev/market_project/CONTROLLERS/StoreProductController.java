package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.StoreProductDTO;
import com.jumayev.market_project.SERVICES.classes.StoreProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("/api/home/storeproduct")
public class StoreProductController implements EntyController<StoreProductDTO>{
    private final StoreProductService service;

    @Override
    public List<StoreProductDTO> getAll() {
        return service.getAll();
    }

    @Override
    public StoreProductDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public StoreProductDTO update(StoreProductDTO body) {
        return service.update(body.getId(), body);
    }

    @Override
    public StoreProductDTO create(StoreProductDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
