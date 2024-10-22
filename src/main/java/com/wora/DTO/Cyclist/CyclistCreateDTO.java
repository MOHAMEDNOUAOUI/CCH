package com.wora.DTO.Cyclist;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CyclistCreateDTO {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Positive
    private int age;

    @NotBlank
    private String nationality;

    private Long teamId;
}
