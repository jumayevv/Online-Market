package com.jumayev.market_project.SERVICES;

import java.util.List;

public interface EntyService<D>{

    D getById(Long target);
    List<D> getAll();

    D create(D info);

    D update(Long target,D info);

    void deleteById(Long target);

}
