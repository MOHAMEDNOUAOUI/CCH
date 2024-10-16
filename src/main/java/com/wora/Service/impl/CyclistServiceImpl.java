package com.wora.Service.impl;

import com.wora.DAO.CyclistDAO;
import com.wora.Entity.Cyclist;
import com.wora.Service.CyclistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CyclistServiceImpl implements CyclistService {

    private final CyclistDAO cyclistDAO;

    public CyclistServiceImpl(CyclistDAO cyclistDAO) {
        this.cyclistDAO = cyclistDAO;
    }

    @Override
    public Optional<Cyclist> saveCyclist(Cyclist cyclist) {
        return cyclistDAO.save(cyclist);
    }

    @Override
    public Optional<Cyclist> updateCyclist(Cyclist cyclist) {
        return cyclistDAO.update(cyclist);
    }

    @Override
    public List<Cyclist> findAllCyclists() {
        return cyclistDAO.findAllCyclistWithCompetitionsAndTeam();
    }

    @Override
    public void deleteCyclist(Cyclist cyclist) {
        cyclistDAO.delete(cyclist);
    }

    @Override
    public Optional<Cyclist> findCyclistById(Long id) {
        return cyclistDAO.findById(id);
    }
}
