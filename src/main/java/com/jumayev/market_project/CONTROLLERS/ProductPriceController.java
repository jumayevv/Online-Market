package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.ProductPriceDTO;
import com.jumayev.market_project.SERVICES.classes.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("home/productprice")
public class ProductPriceController implements EntyController<ProductPriceDTO> {
    private final ProductPriceService service;
    @Override
    public List<ProductPriceDTO> getAll() {
        return service.getAll();
    }

    @Override
    public ProductPriceDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public ProductPriceDTO update(ProductPriceDTO body) {
        return service.update(body.getId(),body);
    }

    @Override
    public ProductPriceDTO create(ProductPriceDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
