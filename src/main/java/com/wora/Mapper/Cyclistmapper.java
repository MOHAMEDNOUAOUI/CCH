package com.wora.Mapper;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.CyclistResponseDTO;
import com.wora.Entity.Cyclist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring" , uses = TeamMapper.class)
public interface Cyclistmapper {
//    Cyclistmapper INSTANCE = Mappers.getMapper(Cyclistmapper.class);

    @Mapping(source = "team" , target = "team" , qualifiedByName = "toCyclistCreateDTO")
    CyclistResponseDTO toResponseDto(Cyclist cyclist);
    @Mapping(source = "teamId" , target = "team.id")
    Cyclist toEntity(CyclistCreateDTO cyclistCreateDTO);
    CyclistCreateDTO toCyclistCreateDTO(Cyclist cyclist);
    List<CyclistResponseDTO> toResponseDtoList(List<Cyclist> cyclistList);
    List<Cyclist> toEntityList(List<CyclistCreateDTO> cyclistCreateDTOList);
}
