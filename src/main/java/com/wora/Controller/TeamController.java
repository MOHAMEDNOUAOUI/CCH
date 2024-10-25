package com.wora.Controller;

import com.wora.DTO.Team.Response.TeamResponseDTO;
import com.wora.DTO.Team.TeamCreateDTO;
import com.wora.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<TeamResponseDTO> getAllTeams() {
        return teamService.findAllTeams();
    }

    @GetMapping("/{id}")
    public TeamResponseDTO findTeamById(@PathVariable("id") Long id) {
        return teamService.findTeamById(id);
    }
}
