package com.wora.Mapper;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.CyclistResponseDTO;
import com.wora.Entity.Cyclist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring" , uses = MapperBase.class)
public interface Cyclistmapper {
//    Cyclistmapper INSTANCE = Mappers.getMapper(Cyclistmapper.class);

    CyclistResponseDTO toResponseDto(Cyclist cyclist);
    @Mapping(source = "teamId" , target = "team" , qualifiedByName = "teamIdToTeam")
    Cyclist toEntity(CyclistCreateDTO cyclistCreateDTO);
    CyclistCreateDTO toCyclistCreateDTO(Cyclist cyclist);
}
