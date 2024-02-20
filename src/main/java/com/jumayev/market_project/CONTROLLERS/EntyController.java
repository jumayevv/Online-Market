package com.jumayev.market_project.CONTROLLERS;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface EntyController<D> {

    @GetMapping
    List<D> getAll();

    @GetMapping("/{id}")
    D getById(@PathVariable Long id);

    @PutMapping
    D update(@RequestBody D body);

    @PostMapping
    D create(@RequestBody D body);
    @DeleteMapping("/{id}")
    default String deleteById(@PathVariable Long id){
        return "Deleted Successfully";
    };

}
