package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.AcceptDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptDocREPO extends JpaRepository<AcceptDoc,Long> {
}
