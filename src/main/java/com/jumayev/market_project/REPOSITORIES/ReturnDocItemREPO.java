package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.ReturnDocItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnDocItemREPO extends JpaRepository<ReturnDocItem,Long> {
}
