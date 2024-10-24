package com.wora.Service;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.CyclistResponseDTO;
import com.wora.Entity.Cyclist;

import java.util.List;
import java.util.Optional;

public interface CyclistService {
    CyclistResponseDTO saveCyclist(CyclistCreateDTO cyclistCreateDTO);
    Optional<Cyclist> updateCyclist(Cyclist cyclist);
    List<CyclistResponseDTO> findAllCyclists();
    void deleteCyclist(Cyclist cyclist);
    Optional<CyclistResponseDTO> findCyclistById(Long id);
}
