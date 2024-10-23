package com.wora.Mapper;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.Response.CyclistResponseDTO;
import com.wora.DTO.Team.TeamCreateDTO;
import com.wora.Entity.Cyclist;
import com.wora.Entity.Team;
import com.wora.Mapper.Team.TeamResponseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = TeamResponseMapper.class)
public interface CyclistResponseMapper extends GenericMapper<CyclistResponseDTO , Cyclist>{
    CyclistResponseMapper INSTANCE = Mappers.getMapper(CyclistResponseMapper.class);
}
