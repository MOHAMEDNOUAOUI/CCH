package com.wora.Controller;


import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.CyclistResponseDTO;
import com.wora.DTO.Cyclist.CyclistUpdateDTO;
import com.wora.Entity.Cyclist;
import com.wora.Service.CyclistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

@RestController
@RequestMapping("api/v1/cyclists")
public class CyclistController {

    @Autowired
    private CyclistService cyclistService;

    @GetMapping
    public ResponseEntity<List<CyclistResponseDTO>> getCyclists() {
        List<CyclistResponseDTO> list = cyclistService.findAllCyclists();
        if(list.isEmpty()){
            ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CyclistResponseDTO> getCyclist(@PathVariable("id") Long id) {

        Optional<CyclistResponseDTO> responseDTO = cyclistService.findCyclistById(id);
        if (!responseDTO.isPresent()) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(responseDTO.get());
    }

    @PostMapping
    public CyclistResponseDTO cyclists(@RequestBody CyclistCreateDTO cyclistCreateDTO) {
        return cyclistService.saveCyclist(cyclistCreateDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CyclistResponseDTO> cyclistupdate(@PathVariable("id") Long id, @RequestBody CyclistCreateDTO cyclistCreateDTO) {
        Optional<CyclistResponseDTO> cyclistResponseDTO = cyclistService.updateCyclist(id,cyclistCreateDTO);
        if (!cyclistResponseDTO.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(cyclistResponseDTO.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCyclist(@PathVariable("id") Long id) {
        if(!cyclistService.deleteCyclist(id)) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok().build();
    }






}
