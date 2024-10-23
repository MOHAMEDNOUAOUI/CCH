package com.wora.Mapper.Team;

import com.wora.DTO.Team.TeamCreateDTO;
import com.wora.Entity.Team;
import com.wora.Mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface TeamResponseMapper extends GenericMapper<TeamCreateDTO , Team> {
    TeamResponseMapper INSTANCE = Mappers.getMapper(TeamResponseMapper.class);
}
