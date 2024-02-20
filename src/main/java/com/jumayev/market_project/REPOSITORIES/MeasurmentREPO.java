package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.Measurment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurmentREPO extends JpaRepository<Measurment,Long> {
}
