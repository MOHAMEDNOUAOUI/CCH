package com.wora.Mapper;


import com.wora.DTO.Team.Response.TeamResponseDTO;
import com.wora.DTO.Team.TeamCreateDTO;
import com.wora.Entity.Cyclist;
import com.wora.Entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    Team toEntity(TeamCreateDTO teamCreateDTO);
    @Named("toCyclistCreateDTO")
    TeamCreateDTO toCyclistCreateDTO(Team team);
    @Named("toResponseDTO")
    TeamResponseDTO toResponseDTO(Team team);
    List<TeamResponseDTO> toResponseDTOList(List<Team> teams);
    List<Team> toEntityList(List<TeamCreateDTO> teamCreateDTOs);
}
