package com.wora;

import com.wora.DAO.CyclistDAO;
import com.wora.DAO.impl.CyclistDAOImpl;
import com.wora.Entity.Cyclist;
import com.wora.Entity.Team;
import com.wora.Service.CyclistService;
import com.wora.Service.TeamService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class Main {
    private static SessionFactory sessionFactory;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CyclistService cyclistService = context.getBean(CyclistService.class);
        TeamService teamService = context.getBean(TeamService.class);
        Optional<Team> team = teamService.findTeamById(Long.valueOf(1));
        Cyclist cyclist = new Cyclist();
        cyclist.setAge(20);
        cyclist.setNationality("maghrebi");
        cyclist.setFirstname("Mohamed");
        cyclist.setLastname("Nouaoui");
        cyclist.setTeam(team.get());
        cyclistService.saveCyclist(cyclist);
    }
}


