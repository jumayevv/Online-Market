package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceREPO extends JpaRepository<ProductPrice,Long> {
}
