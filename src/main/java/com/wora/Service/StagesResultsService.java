package com.wora.Service;

import com.wora.Entity.GeneralResults;
import com.wora.Entity.StagesResults;

import java.util.List;
import java.util.Optional;

public interface StagesResultsService {
    Optional<StagesResults> save(StagesResults stagesResults);
    Optional<StagesResults> findById(Long id);
    List<StagesResults> findAll();
    Optional<StagesResults> update(StagesResults stagesResults);
    void delete(StagesResults stagesResults);
}
