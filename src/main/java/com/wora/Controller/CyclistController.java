package com.wora.Controller;


import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.CyclistResponseDTO;
import com.wora.Entity.Cyclist;
import com.wora.Service.CyclistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/cyclist")
public class CyclistController {

    @Autowired
    private CyclistService cyclistService;

    @PostMapping
    public CyclistResponseDTO cyclists(@RequestBody CyclistCreateDTO cyclistCreateDTO) {
        return cyclistService.saveCyclist(cyclistCreateDTO);
    }
    @GetMapping
    public List<CyclistResponseDTO> getCyclists() {
        return cyclistService.findAllCyclists();
    }

    @GetMapping("/{id}")
    public CyclistResponseDTO getCyclist(@PathVariable("id") Long id) {
        return cyclistService.findCyclistById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cyclist not found"));
    }


}
