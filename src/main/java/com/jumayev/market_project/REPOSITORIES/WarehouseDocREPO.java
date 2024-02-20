package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.WarehouseDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseDocREPO extends JpaRepository<WarehouseDoc,Long> {
}
