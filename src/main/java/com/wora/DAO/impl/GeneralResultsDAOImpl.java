package com.wora.DAO.impl;

import com.wora.DAO.GeneralResultsDAO;
import com.wora.Entity.GeneralResults;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class GeneralResultsDAOImpl extends GenericDAOImpl<GeneralResults> implements GeneralResultsDAO {

    public GeneralResultsDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory , GeneralResults.class);
    }
}
