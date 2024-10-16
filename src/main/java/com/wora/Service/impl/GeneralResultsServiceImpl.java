package com.wora.Service.impl;

import com.wora.DAO.GeneralResultsDAO;
import com.wora.Entity.GeneralResults;
import com.wora.Service.GeneralResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneralResultsServiceImpl implements GeneralResultsService {

    private final GeneralResultsDAO generalResultsDAO;

    public GeneralResultsServiceImpl(GeneralResultsDAO generalResultsDAO) {
        this.generalResultsDAO = generalResultsDAO;
    }

    @Override
    public Optional<GeneralResults> save(GeneralResults generalResults) {
        return  generalResultsDAO.save(generalResults);
    }

    @Override
    public Optional<GeneralResults> findById(Long id) {
        return generalResultsDAO.findById(id);
    }

    @Override
    public Optional<GeneralResults> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<GeneralResults> findAll() {
        return generalResultsDAO.findAll();
    }

    @Override
    public Optional<GeneralResults> update(GeneralResults generalResults) {
        return  generalResultsDAO.update(generalResults);
    }

    @Override
    public void delete(GeneralResults generalResults) {
        generalResultsDAO.delete(generalResults);
    }
}
