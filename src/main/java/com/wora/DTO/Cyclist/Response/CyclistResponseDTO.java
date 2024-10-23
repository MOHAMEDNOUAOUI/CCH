package com.wora.DTO.Cyclist.Response;

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

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String nationality;
    @NotBlank
    private int age;

    private TeamCreateDTO team;
}
