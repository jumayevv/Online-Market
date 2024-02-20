package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.AcceptDocItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptDocItemREPO extends JpaRepository<AcceptDocItem,Long> {
}
