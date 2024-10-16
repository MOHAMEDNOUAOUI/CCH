package com.wora.DAO.impl;

import com.wora.DAO.TeamDAO;
import com.wora.Entity.Team;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDAOImpl extends GenericDAOImpl<Team> implements TeamDAO {

    public TeamDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory , Team.class);
    }
}
