package com.wora.Service;

import com.wora.Entity.Competition;

import java.util.List;
import java.util.Optional;

public interface CompetitionService {
    Optional<Competition> saveCompetition(Competition competition);
    Optional<Competition> updateCompetition(Competition competition);
    List<Competition> findAllCompetitions();
    void deleteCompetition(Competition competition);
    Optional<Competition> findCompetitionById(Long id);
    Optional<Competition> findCompetitionByName(String name);
}
