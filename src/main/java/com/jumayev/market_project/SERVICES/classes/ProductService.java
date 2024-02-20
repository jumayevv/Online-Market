package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.ProductDTO;
import com.jumayev.market_project.ENTITIES.Product;
import com.jumayev.market_project.MAPPERS.classes.ProductMapper;
import com.jumayev.market_project.REPOSITORIES.ProductREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements EntyService<ProductDTO> {
    private final ProductREPO repository;
    private final ProductMapper mapper;

    @Override
    public ProductDTO getById(Integer target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<ProductDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public ProductDTO create(ProductDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public ProductDTO update(Integer target, ProductDTO info) {
        Product temp =  repository.getReferenceById(target);
        temp.setName(info.getName());
        temp.setAmount(info.getAmount());
        temp.setMeasure_type(info.getMeasure_type());
        temp.setCategory_id(info.getCategory_id());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Integer target) {
        repository.deleteById(target);
    }
}
