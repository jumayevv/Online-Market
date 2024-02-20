package com.jumayev.market_project.CONTROLLERS;


import com.jumayev.market_project.DTO.CategoryDTO;
import com.jumayev.market_project.SERVICES.classes.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("home/category")
public class CategoryController implements EntyController<CategoryDTO> {
    private final CategoryService service;

    @Override
    public List<CategoryDTO> getAll(){
        return service.getAll();
    }

    @Override
    public CategoryDTO getById(Long id){
        return service.getById(id);
    }

    @Override
    public CategoryDTO update(CategoryDTO categoryDTO){
        return service.update(categoryDTO.getId(),categoryDTO);
    }

    @Override
    public CategoryDTO create(@RequestBody CategoryDTO categoryDTO){
        return service.create(categoryDTO);
    }

    @Override
    public String deleteById(Long id){
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
