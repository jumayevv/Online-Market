package com.jumayev.market_project.CONTROLLERS;


import com.jumayev.market_project.DTO.ProductDTO;
import com.jumayev.market_project.SERVICES.classes.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("/api/home/product")
public class ProductController implements EntyController<ProductDTO> {
    private final ProductService service;

    @Override
    public List<ProductDTO> getAll(){
        return service.getAll();
    }

    @Override
    public ProductDTO getById(Long id){
        return service.getById(id);
    }

    @Override
    public ProductDTO update(ProductDTO productDTO){
        return service.update(productDTO.getId(),productDTO);
    }

    @Override
    public ProductDTO create(ProductDTO productDTO){
        return service.create(productDTO);
    }

    @Override
    public String deleteById(Long id){
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
