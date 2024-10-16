package com.wora.Service.impl;

import com.wora.DAO.StagesResultsDAO;
import com.wora.Entity.StagesResults;
import com.wora.Service.StagesResultsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StagesResultsServiceImpl implements StagesResultsService {

    private StagesResultsDAO stagesResultsDAO;

    public StagesResultsServiceImpl(StagesResultsDAO stagesResultsDAO) {
        this.stagesResultsDAO = stagesResultsDAO;
    }

    @Override
    public Optional<StagesResults> save(StagesResults stagesResults) {
        return Optional.empty();
    }

    @Override
    public Optional<StagesResults> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<StagesResults> findAll() {
        return List.of();
    }

    @Override
    public Optional<StagesResults> update(StagesResults stagesResults) {
        return Optional.empty();
    }

    @Override
    public void delete(StagesResults stagesResults) {

    }
}
