package com.jumayev.market_project.CONTROLLERS;


import com.jumayev.market_project.DTO.MeasurmentDTO;
import com.jumayev.market_project.SERVICES.classes.MeasurmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor @RestController @RequestMapping("/api/home/measurment")
public class MeasurmentController implements EntyController<MeasurmentDTO> {
    private final MeasurmentService service;

    @Override
    public List<MeasurmentDTO> getAll() {
        return service.getAll();
    }

    @Override
    public MeasurmentDTO getById(Long id) {
        return service.getById(id);
    }

    @Override
    public MeasurmentDTO update(MeasurmentDTO body) {
        return service.update(body.getId(),body);
    }

    @Override
    public MeasurmentDTO create(MeasurmentDTO body) {
        return service.create(body);
    }

    @Override
    public String deleteById(Long id) {
        service.deleteById(id);
        return EntyController.super.deleteById(id);
    }
}
