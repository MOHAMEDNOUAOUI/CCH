package com.wora.DAO;

import com.wora.Entity.Competition;

import java.util.List;

public interface CompetitionDAO extends GenericDAO<Competition> {

    List<Competition> getAllCOmpetitionsWithStages();

}
