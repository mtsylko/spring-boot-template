package com.etest.service;

import java.util.List;

public interface CrudService <E, D> {

    void save(D entity);

    D get(Long id);

    List<D> getList();

    void remove(Long id);


}
