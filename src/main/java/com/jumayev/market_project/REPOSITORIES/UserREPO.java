package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserREPO extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
