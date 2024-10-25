package com.wora.Service;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.CyclistResponseDTO;
import com.wora.DTO.Cyclist.CyclistUpdateDTO;
import com.wora.Entity.Cyclist;

import java.util.List;
import java.util.Optional;

public interface CyclistService {
    CyclistResponseDTO saveCyclist(CyclistCreateDTO cyclistCreateDTO);
    Optional<CyclistResponseDTO> updateCyclist(Long id , CyclistCreateDTO cyclistCreateDTO);
    List<CyclistResponseDTO> findAllCyclists();
    boolean deleteCyclist(Long id);
    Optional<CyclistResponseDTO> findCyclistById(Long id);
}
