package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.StoreDocItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDocItemREPO extends JpaRepository<StoreDocItem,Long> {
}
