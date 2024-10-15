package com.wora;

import com.wora.DAO.CyclistDAO;
import com.wora.DAO.impl.CyclistDAOImpl;
import com.wora.Entity.Cyclist;
import com.wora.Service.CyclistService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CyclistService cyclistService = context.getBean(CyclistService.class);
        Cyclist cyclist = new Cyclist();
        cyclist.setFirstname("MOHAMED");
        cyclist.setLastname("MOHAMED");
        cyclist.setAge(20);
        cyclist.setNationality("Moroccan");

        Optional<Cyclist> savedCyclist = cyclistService.saveCyclist(cyclist);
        if (savedCyclist.isPresent()) {
            System.out.println("Cyclist saved: " + savedCyclist.get());
        } else {
            System.out.println("Failed to save cyclist.");
        }
    }
}