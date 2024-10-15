package com.wora.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "competition")
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @Column(name = "year")
    private Integer year;

    @Column(name = "lieu")
    @NotBlank
    private String lieu;

    @NotBlank
    @Column(name = "distance")
    private Double distance;

    @NotBlank
    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "endDate")
    @NotBlank
    private LocalDate endDate;

    @OneToMany(mappedBy = "competition" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private Set<GeneralResults> generalResults = new HashSet<>();

    @OneToMany(mappedBy = "competition")
    private List<Stage> stages = new ArrayList<>();
}