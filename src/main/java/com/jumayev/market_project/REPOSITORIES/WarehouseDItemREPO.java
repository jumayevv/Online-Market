package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.WarehouseDItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseDItemREPO extends JpaRepository<WarehouseDItem,Long> {
}
