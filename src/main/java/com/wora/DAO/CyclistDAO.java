package com.wora.DAO;

import com.wora.Entity.Cyclist;

import java.util.List;

public interface CyclistDAO extends GenericDAO<Cyclist> {
    List<Cyclist> findAllCyclistWithCompetitionsAndTeam();
}
