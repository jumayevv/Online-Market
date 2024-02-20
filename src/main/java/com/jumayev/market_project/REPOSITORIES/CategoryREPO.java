package com.jumayev.market_project.REPOSITORIES;


import com.jumayev.market_project.ENTITIES.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryREPO extends JpaRepository<Category,Long> {
}
