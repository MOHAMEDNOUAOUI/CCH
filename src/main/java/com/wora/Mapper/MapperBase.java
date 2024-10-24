package com.wora.Mapper;

import com.wora.Entity.Team;
import com.wora.Service.TeamService;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperBase {
    private final TeamService teamService;

    @Autowired
    public MapperBase(TeamService teamService) {
        this.teamService = teamService;
    }
    @Named("teamIdToTeam")
    public Team map(Long teamId) {
        return teamId != null ? teamService.findTeamById(teamId).get() : null;
    }


}