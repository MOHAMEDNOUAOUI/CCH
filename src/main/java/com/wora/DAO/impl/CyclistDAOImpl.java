package com.wora.DAO.impl;

import com.wora.DAO.CyclistDAO;
import com.wora.Entity.Cyclist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CyclistDAOImpl extends GenericDAOImpl<Cyclist> implements CyclistDAO {

    public CyclistDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory , Cyclist.class);
    }

    @Override
    public List findAllCyclistWithCompetitionsAndTeam() {
        Transaction transaction = null;
        Session session = this.getSessionFactory().openSession();
        try{
            return session.createQuery("from Cyclist c JOIN FETCH c.generalResults gr JOIN FETCH gr.competition JOIN FETCH c.team ").list();
        }catch(Exception e){
            e.printStackTrace();
            return List.of();
        }
    }

}
