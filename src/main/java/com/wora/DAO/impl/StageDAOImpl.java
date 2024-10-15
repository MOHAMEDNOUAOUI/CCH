package com.wora.DAO.impl;

import com.wora.DAO.StageDAO;
import com.wora.Entity.Stage;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StageDAOImpl extends GenericDAOImpl<Stage> implements StageDAO {

    @Autowired
    public StageDAOImpl(SessionFactory sessionFactory) {
        super(Stage.class);
        setSessionFactory(sessionFactory);
    }
}
