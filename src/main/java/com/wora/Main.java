package com.wora;

import com.wora.DAO.CyclistDAO;
import com.wora.DAO.impl.CyclistDAOImpl;
import com.wora.Entity.Competition;
import com.wora.Entity.Cyclist;
import com.wora.Entity.Team;
import com.wora.Service.CompetitionService;
import com.wora.Service.CyclistService;
import com.wora.Service.TeamService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    private static SessionFactory sessionFactory;
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    CyclistService cyclistService = (CyclistService) context.getBean("cyclistServiceImpl");
    Cyclist c = cyclistService.findAllCyclists().get(0);
    System.out.println(c.getTeam().getName());
    }
}


