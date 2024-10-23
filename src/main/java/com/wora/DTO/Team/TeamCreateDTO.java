package com.wora.DTO.Team;

import jakarta.validation.constraints.NotBlank;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TeamCreateDTO {

    @NotBlank
    private String name;
    @NotBlank
    private String country;
}
