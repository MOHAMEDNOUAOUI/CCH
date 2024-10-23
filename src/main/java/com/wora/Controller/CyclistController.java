package com.wora.Controller;


import com.wora.DTO.Cyclist.CyclistCreateDTO;
import com.wora.DTO.Cyclist.Response.CyclistResponseDTO;
import com.wora.Entity.Cyclist;
import com.wora.Service.CyclistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


}
