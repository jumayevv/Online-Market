package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductREPO extends JpaRepository<Product,Long> {
}
