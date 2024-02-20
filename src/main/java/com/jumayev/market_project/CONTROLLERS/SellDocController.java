package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.DTO.SellDocDTO;
import com.jumayev.market_project.SERVICES.classes.SellDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("home/selldoc")
public class SellDocController implements EntyController<SellDocDTO>{
    private final SellDocService service;

    @Override
    public List<SellDocDTO> getAll() {
        return service.getAll();
    }

    @Override
    public SellDocDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public SellDocDTO update(SellDocDTO body) {
        return service.update(body.getId(), body);
    }

    @Override
    public SellDocDTO create(SellDocDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
