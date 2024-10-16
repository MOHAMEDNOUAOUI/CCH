package com.wora.Service;

import com.wora.Entity.GeneralResults;

import java.util.List;
import java.util.Optional;

public interface GeneralResultsService {
    Optional<GeneralResults> save(GeneralResults generalResults);
    Optional<GeneralResults> findById(Long id);
    Optional<GeneralResults> findByName(String name);
    List<GeneralResults> findAll();
    Optional<GeneralResults> update(GeneralResults generalResults);
    void delete(GeneralResults generalResults);
}
