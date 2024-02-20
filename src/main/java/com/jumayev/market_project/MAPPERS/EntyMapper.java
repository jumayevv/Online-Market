package com.jumayev.market_project.MAPPERS;

import java.util.List;

public interface EntyMapper<D,E> {

    D toDTO(E enty);

    E toENTITY(D dto);

    List<E> toEntityList(List<D> dList);
    List<D> toDTOList(List<E> eList);



}
