package com.wora;

import com.wora.DAO.CyclistDAO;
import com.wora.DAO.impl.CyclistDAOImpl;
import com.wora.Entity.*;
import com.wora.Entity.Embeded.GeneralResultsEmbd;
import com.wora.Service.*;
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
        CyclistService cyclistService = context.getBean(CyclistService.class);
        GeneralResultsService generalResultsService = context.getBean(GeneralResultsService.class);
        CompetitionService competitionService = context.getBean(CompetitionService.class);
        TeamService teamService = context.getBean(TeamService.class);
        StageService stageService = context.getBean(StageService.class);

        Optional<Competition> competition = competitionService.findCompetitionById(Long.valueOf(1));
        Competition competition1 = competition.get();

        // for inserting stages
//        for (int i = 1; i <= 5 ; i++){
//            Stage stage = new Stage();
//            stage.setCompetition(competition1);
//            stage.setName("Stage" + i);
//            stageService.saveStage(stage);
//        }




//        Optional<Cyclist> cyclist = cyclistService.findCyclistById(Long.valueOf(2));
//
//        Cyclist cyclist2 = cyclist.orElse(null);
//        cyclist2.getGeneralResults().forEach(general -> {
//            System.out.println("Rank :" + general.getGeneralrank());
//            System.out.println("Competition :"+general.getCompetition().getName());
//        });


//        Optional<Team> team = teamService.findTeamById(Long.valueOf(2));
//        Optional<Competition> competition = competitionService.findCompetitionById(Long.valueOf(1));
//        Optional<Cyclist> cyclist = cyclistService.findCyclistById(Long.valueOf(2));
//
//
//
//
//            if(cyclist.isPresent() && competition.isPresent()){
//
//                Cyclist cyclist1 = cyclist.get();
//                Competition competition1 = competition.get();
//                System.out.println(competition1.getName());
//
//                GeneralResults generalResults = new GeneralResults();
//                GeneralResultsEmbd embd = new GeneralResultsEmbd();
//                embd.setCompetitionId(competition1.getId());
//                embd.setCyclistId(cyclist1.getId());
//
//
//                generalResults.setCompetition(competition1);
//                generalResults.setCyclist(cyclist1);
//                generalResults.setGeneralResults(embd);
//                generalResults.setGeneralrank(2);
//                generalResultsService.update(generalResults);
//
//
//            }


    }
}


