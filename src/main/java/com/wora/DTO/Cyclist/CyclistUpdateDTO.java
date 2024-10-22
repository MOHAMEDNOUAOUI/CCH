package com.wora.DTO.Cyclist;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CyclistUpdateDTO {

    @NotNull
    private Long id;
    private String firstname;
    private String lastname;
    private Integer age;
    private String nationality;
    private Long teamId;
}
