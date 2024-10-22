package com.wora.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cyclist")
public class CyclistController {

    @GetMapping
    public String cyclists() {
        return "NOT TESTING";
    }

}
