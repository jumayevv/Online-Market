package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.CategoryDTO;
import com.jumayev.market_project.ENTITIES.Category;
import com.jumayev.market_project.MAPPERS.classes.CategoryMapper;
import com.jumayev.market_project.REPOSITORIES.CategoryREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryService implements EntyService<CategoryDTO> {

    private final CategoryREPO repository;
    private final CategoryMapper mapper;

    @Override
    public CategoryDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<CategoryDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public CategoryDTO create(CategoryDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public CategoryDTO update(Long target, CategoryDTO info) {
        Category temp = repository.getReferenceById(target);
        temp.setName(info.getName());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
