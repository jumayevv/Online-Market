package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.MeasurmentDTO;
import com.jumayev.market_project.ENTITIES.Measurment;
import com.jumayev.market_project.MAPPERS.classes.MeasurmentMapper;
import com.jumayev.market_project.REPOSITORIES.MeasurmentREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class MeasurmentService implements EntyService<MeasurmentDTO> {

        private final MeasurmentREPO repository;
        private final MeasurmentMapper mapper;
    @Override
    public MeasurmentDTO getById(Integer target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<MeasurmentDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public MeasurmentDTO create(MeasurmentDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public MeasurmentDTO update(Integer target, MeasurmentDTO info) {
        Measurment temp = repository.getReferenceById(target);
        temp.setName(info.getName());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Integer target) {
        repository.deleteById(target);
    }
}
