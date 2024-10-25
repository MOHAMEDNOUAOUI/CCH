package com.wora.Service.impl;

import com.wora.DAO.TeamDAO;
import com.wora.DAO.impl.TeamDAOImpl;
import com.wora.DTO.Team.Response.TeamResponseDTO;
import com.wora.DTO.Team.TeamCreateDTO;
import com.wora.Entity.Team;
import com.wora.Mapper.TeamMapper;
import com.wora.Mapper.TeamMapperImpl;
import com.wora.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamDAO teamDAO;
    private final TeamMapper teamMapper;

    @Autowired
    public TeamServiceImpl(TeamDAOImpl teamDAO , TeamMapper teamMapper) {
        this.teamDAO = teamDAO;
        this.teamMapper = teamMapper;
    }

    @Override
    public TeamResponseDTO findTeamById(Long id) {
        return  teamMapper.toResponseDTO(teamDAO.findById(id).get());
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
    public List<TeamResponseDTO> findAllTeams() {
        return teamMapper.toResponseDTOList(teamDAO.findAll());
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
