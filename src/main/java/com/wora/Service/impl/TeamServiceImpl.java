package com.wora.Service.impl;

import com.wora.DAO.TeamDAO;
import com.wora.DAO.impl.TeamDAOImpl;
import com.wora.Entity.Team;
import com.wora.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamDAO teamDAO;
    @Autowired
    public TeamServiceImpl(TeamDAOImpl teamDAO) {
        this.teamDAO = teamDAO;
    }

    @Override
    public Optional<Team> findTeamById(Long id) {
        return  teamDAO.findById(id);
    }

    @Override
    public Optional<Team> findTeamByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Team> saveTeam(Team team) {
        return  teamDAO.save(team);
    }

    @Override
    public List<Team> findAllTeams() {
        return teamDAO.findAll();
    }

    @Override
    public void deleteTeam(Team team) {
    teamDAO.delete(team);
    }

    @Override
    public Optional<Team> updateTeam(Team team) {
        return teamDAO.update(team);
    }
}
