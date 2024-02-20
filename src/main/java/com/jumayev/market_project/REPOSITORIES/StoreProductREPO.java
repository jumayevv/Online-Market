package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.StoreProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreProductREPO extends JpaRepository<StoreProduct,Long> {
}
