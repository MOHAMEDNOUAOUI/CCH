package com.wora.DAO.impl;

import com.wora.DAO.CyclistDAO;
import com.wora.Entity.Cyclist;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CyclistDAOImpl extends GenericDAOImpl<Cyclist> implements CyclistDAO {

    @Autowired
    public CyclistDAOImpl(SessionFactory sessionFactory) {
        super(Cyclist.class);
        this.setSessionFactory(sessionFactory);
    }

}
