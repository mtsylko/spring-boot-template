package com.etest.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public abstract class BasicService <ID, T> implements CrudService<ID, T> {

    abstract protected MongoRepository<T, ID> getRepository();

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public void remove(ID id) {
        getRepository().deleteById(id);
    }

    public List<T> getList() {
        return getRepository().findAll();
    }

    public Optional<T> get(ID id) {
        return getRepository().findById(id);
    }


}
