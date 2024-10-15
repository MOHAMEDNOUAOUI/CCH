package com.wora.DAO;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<T> {
    Optional<T> save(T entity);
    Optional<T> update(T entity);
    List<T> findAll();
    void delete(T entity);
    Optional<T> findById(Long id);
}
