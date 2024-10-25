package com.wora.DTO.Cyclist;

import com.wora.DTO.Team.Response.TeamResponseDTO;
import com.wora.DTO.Team.TeamCreateDTO;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CyclistResponseDTO {

    private Long id;

    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
    private String nationality;
    @NotBlank
    private int age;
    private TeamCreateDTO team;
}

