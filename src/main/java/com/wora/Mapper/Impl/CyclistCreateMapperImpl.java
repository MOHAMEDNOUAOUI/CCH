package com.wora.Mapper.Impl;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.Entity.Cyclist;
import com.wora.Entity.Team;
import com.wora.Mapper.CyclistCreateMapper;
import com.wora.Service.TeamService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class CyclistCreateMapperImpl implements CyclistCreateMapper {

    @Autowired
    protected TeamService teamService;

    @Override
    @Mapping(target = "team", expression = "java(getTeamById(dto.getTeamId()))")
    public abstract Cyclist toEntity(CyclistCreateDTO dto);

    protected Team getTeamById(Long teamId) {
        if (teamId != null) {
            return teamService.findTeamById(teamId).orElse(null);
        }
        return null;
    }
}
