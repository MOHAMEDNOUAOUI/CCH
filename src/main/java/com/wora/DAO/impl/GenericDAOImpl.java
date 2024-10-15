package com.wora.DAO.impl;

import com.wora.DAO.GenericDAO;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Setter
public class GenericDAOImpl<T> implements GenericDAO<T> {


    private SessionFactory sessionFactory;

    private final Class<T> classGeneric;


    public GenericDAOImpl(Class<T> classGeneric) {
        this.classGeneric = classGeneric;
    }


    @Override
    public Optional<T> save(T entity) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try{
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
            return Optional.of(entity);
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<T> update(T entity) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
            return Optional.of(entity);
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<T> findAll() {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try{
            transaction = session.beginTransaction();
            return session.createQuery("from "+classGeneric.getName() , classGeneric).list();
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    @Override
    public void delete(T entity) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try{
            transaction = session.beginTransaction();
            transaction.begin();
            session.remove(entity);
            transaction.commit();
            }catch (Exception e){
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
        }
    }

    @Override
    public Optional<T> findById(Long id) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try{
            transaction = session.beginTransaction();
            transaction.begin();
            T fake = session.find(classGeneric , id);
            transaction.commit();
            return Optional.ofNullable(fake);
        }catch(Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
            return Optional.empty();
        }
    }



}
