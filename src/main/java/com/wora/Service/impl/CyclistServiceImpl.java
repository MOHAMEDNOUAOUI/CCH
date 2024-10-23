package com.wora.Service.impl;

import com.wora.DAO.CyclistDAO;
import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.Response.CyclistResponseDTO;
import com.wora.DTO.Team.TeamCreateDTO;
import com.wora.Entity.Cyclist;
import com.wora.Entity.Team;
import com.wora.Mapper.CyclistCreateMapper;
import com.wora.Mapper.CyclistResponseMapper;
import com.wora.Mapper.Team.TeamResponseMapper;
import com.wora.Service.CyclistService;
import com.wora.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CyclistServiceImpl implements CyclistService {

    private final CyclistDAO cyclistDAO;

    @Autowired
    private TeamService teamService;

    @Autowired
    private CyclistCreateMapper cyclistCreateMapper;

    @Autowired
    public CyclistServiceImpl(CyclistDAO cyclistDAO) {
        this.cyclistDAO = cyclistDAO;
    }

    @Override
    public CyclistResponseDTO saveCyclist(CyclistCreateDTO cyclistCreateDTO) {
        Cyclist cyclist = cyclistCreateMapper.toEntity(cyclistCreateDTO);
        cyclistDAO.save(cyclist);
        return CyclistResponseMapper.INSTANCE.toDTO(cyclist);
    }

    @Override
    public Optional<Cyclist> updateCyclist(Cyclist cyclist) {
        return cyclistDAO.update(cyclist);
    }

    @Override
    public List<Cyclist> findAllCyclists() {
        return cyclistDAO.findAllCyclistWithCompetitionsAndTeam();
    }

    @Override
    public void deleteCyclist(Cyclist cyclist) {
        cyclistDAO.delete(cyclist);
    }

    @Override
    public Optional<Cyclist> findCyclistById(Long id) {
        return cyclistDAO.findById(id);
    }
}
