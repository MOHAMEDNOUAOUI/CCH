package com.wora.DAO.impl;

import com.wora.DAO.CompetitionDAO;
import com.wora.Entity.Competition;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompetitionDAOImpl extends GenericDAOImpl<Competition> implements CompetitionDAO {

    public CompetitionDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory, Competition.class);
    }

    @Override
    public List<Competition> getAllCOmpetitionsWithStages() {
        return List.of();
    }
}
