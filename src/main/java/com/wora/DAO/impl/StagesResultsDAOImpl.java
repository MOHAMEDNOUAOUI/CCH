package com.wora.DAO.impl;

import com.wora.DAO.StagesResultsDAO;
import com.wora.Entity.StagesResults;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StagesResultsDAOImpl extends GenericDAOImpl<StagesResults> implements StagesResultsDAO {

    public StagesResultsDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory , StagesResults.class);
    }

}
