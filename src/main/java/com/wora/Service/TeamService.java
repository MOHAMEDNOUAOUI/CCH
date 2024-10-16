package com.wora.Service;

import com.wora.Entity.Stage;
import com.wora.Entity.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    Optional<Team> findTeamById(Long id);
    Optional<Team> findTeamByName(String name);
    Optional<Team> saveTeam(Team team);
    List<Team> findAllTeams();
    void deleteTeam(Team team);
    Optional<Team> updateTeam(Team team);
}
