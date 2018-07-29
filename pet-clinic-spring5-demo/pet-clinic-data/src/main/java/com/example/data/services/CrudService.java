package com.example.data.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);
//    <S extends T> S save(S entity);

    void delete(T object);

    void deleteById(ID id);
}
