package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.DTO.ProductPriceDTO;
import com.jumayev.market_project.ENTITIES.ProductPrice;
import com.jumayev.market_project.MAPPERS.classes.ProductPriceMapper;
import com.jumayev.market_project.REPOSITORIES.ProductPriceREPO;
import com.jumayev.market_project.SERVICES.EntyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class ProductPriceService implements EntyService<ProductPriceDTO> {

    private final ProductPriceREPO repository;
    private final ProductPriceMapper mapper;
    @Override
    public ProductPriceDTO getById(Long target) {
        return mapper.toDTO(repository.getReferenceById(target));
    }

    @Override
    public List<ProductPriceDTO> getAll() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public ProductPriceDTO create(ProductPriceDTO info) {
        return mapper.toDTO(repository.save(mapper.toENTITY(info)));
    }

    @Override
    public ProductPriceDTO update(Long target, ProductPriceDTO info) {
        ProductPrice temp = repository.getReferenceById(target);
        temp.setPrice(info.getPrice());
        temp.setProduct_id(info.getProduct_id());
        temp.setDate(info.getDate());
        temp.setStatus(info.getStatus());
        return mapper.toDTO(repository.save(temp));
    }

    @Override
    public void deleteById(Long target) {
        repository.deleteById(target);
    }
}
