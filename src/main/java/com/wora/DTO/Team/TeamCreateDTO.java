package com.wora.DTO.Team;

import jakarta.validation.constraints.NotBlank;

public class TeamCreateDTO {

    @NotBlank
    private String name;
    @NotBlank
    private String country;
}
