package com.jumayev.market_project.REPOSITORIES;


import com.jumayev.market_project.ENTITIES.ReturnDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnDocREPO extends JpaRepository<ReturnDoc,Long> {
}
