package com.wora.Service.impl;

import com.wora.DAO.CyclistDAO;
import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.CyclistResponseDTO;
import com.wora.Entity.Cyclist;
import com.wora.Mapper.Cyclistmapper;
import com.wora.Service.CyclistService;
import com.wora.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CyclistServiceImpl implements CyclistService {

    private final CyclistDAO cyclistDAO;
    private final Cyclistmapper cyclistmapper;


    @Autowired
    private TeamService teamService;


    @Autowired
    public CyclistServiceImpl(CyclistDAO cyclistDAO , Cyclistmapper cyclistmapper) {
        this.cyclistDAO = cyclistDAO;
        this.cyclistmapper = cyclistmapper;
    }

    @Override
    public CyclistResponseDTO saveCyclist(CyclistCreateDTO cyclistCreateDTO) {
        Cyclist cyclist = cyclistmapper.toEntity(cyclistCreateDTO);
        return cyclistmapper.toResponseDto(cyclistDAO.save(cyclist).get());
    }

    @Override
    public Optional<Cyclist> updateCyclist(Cyclist cyclist) {
        return cyclistDAO.update(cyclist);
    }
    @Override
    public List<CyclistResponseDTO> findAllCyclists() {
        return null;
    }

    @Override
    public void deleteCyclist(Cyclist cyclist) {
        cyclistDAO.delete(cyclist);
    }

    @Override
    public Optional<CyclistResponseDTO> findCyclistById(Long id) {
        Optional<Cyclist> cyclist = cyclistDAO.findById(id);
        return Optional.of(cyclistmapper.toResponseDto(cyclist.get()));
    }
}
