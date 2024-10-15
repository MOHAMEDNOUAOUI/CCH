package com.wora.DAO.impl;

import com.wora.DAO.CompetitionDAO;
import com.wora.Entity.Competition;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompetitionDAOImpl extends GenericDAOImpl<Competition> implements CompetitionDAO {

    @Autowired
    public CompetitionDAOImpl(SessionFactory sessionFactory) {
        super(Competition.class);
        setSessionFactory(sessionFactory);
    }

}
