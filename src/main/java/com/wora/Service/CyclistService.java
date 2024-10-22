package com.wora.Service;

import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.Entity.Cyclist;

import java.util.List;
import java.util.Optional;

public interface CyclistService {
    Optional<Cyclist> saveCyclist(CyclistCreateDTO cyclistCreateDTO);
    Optional<Cyclist> updateCyclist(Cyclist cyclist);
    List<Cyclist> findAllCyclists();
    void deleteCyclist(Cyclist cyclist);
    Optional<Cyclist> findCyclistById(Long id);
}
