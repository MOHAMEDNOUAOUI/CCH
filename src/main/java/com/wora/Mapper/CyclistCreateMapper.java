package com.wora.Mapper;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Team.TeamCreateDTO;
import com.wora.Entity.Cyclist;
import com.wora.Entity.Team;
import com.wora.Service.TeamService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface CyclistCreateMapper extends GenericMapper<CyclistCreateDTO , Cyclist> {
    CyclistCreateMapper INSTANCE = Mappers.getMapper(CyclistCreateMapper.class);
}
