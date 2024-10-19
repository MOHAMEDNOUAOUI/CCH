package com.wora.Service.impl;

import com.wora.DAO.CompetitionDAO;
import com.wora.DAO.impl.CompetitionDAOImpl;
import com.wora.Entity.Competition;
import com.wora.Service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    private final CompetitionDAO competitionDAO;
    @Autowired
    public CompetitionServiceImpl(CompetitionDAO competitionDAO) {
        this.competitionDAO = competitionDAO;
    }

    @Override
    public Optional<Competition> saveCompetition(Competition competition) {
        return competitionDAO.save(competition);
    }

    @Override
    public Optional<Competition> updateCompetition(Competition competition) {
        return competitionDAO.update(competition);
    }

    @Override
    public List<Competition> findAllCompetitions() {
        return competitionDAO.findAll();
    }

    @Override
    public void deleteCompetition(Competition competition) {
    competitionDAO.delete(competition);
    }

    @Override
    public Optional<Competition> findCompetitionById(Long id) {
        return competitionDAO.findById(id);
    }

    @Override
    public Optional<Competition> findCompetitionByName(String name) {
        return Optional.empty();
    }
}
