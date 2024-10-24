package com.wora.Mapper;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.CyclistResponseDTO;
import com.wora.DTO.Team.TeamCreateDTO;
import com.wora.Entity.Cyclist;
import com.wora.Entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    Team toEntity(TeamCreateDTO teamCreateDTO);
    TeamCreateDTO toCyclistCreateDTO(Team team);
    Team map(Long teamId);
}
