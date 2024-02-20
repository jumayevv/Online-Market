package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.SellDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellDocREPO extends JpaRepository<SellDoc,Long> {
}
