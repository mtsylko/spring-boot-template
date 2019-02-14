package com.etest.service;

import java.util.List;
import java.util.Optional;

public interface CrudService <ID, T> {

    T save(T entity);

    Optional<T> get(ID id);

    List<T> getList();

    void remove(ID id);


}
