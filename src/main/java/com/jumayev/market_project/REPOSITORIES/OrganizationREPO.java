package com.jumayev.market_project.REPOSITORIES;

import com.jumayev.market_project.ENTITIES.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrganizationREPO extends JpaRepository<Organization,Long> {
}
