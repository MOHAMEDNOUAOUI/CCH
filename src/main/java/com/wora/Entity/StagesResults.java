package com.wora.Entity;


import com.wora.Entity.Embeded.ResultsStage;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;

@Entity
@Table(name = "stage_results")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StagesResults {

    @EmbeddedId
    private ResultsStage resultsStage;

    @NotBlank
    @Positive
    private Integer position;

    @NotNull
    @Positive
    private Duration duration;

    @ManyToOne
    @MapsId("cyclistId")
    private Cyclist cyclist;

    @ManyToOne
    @MapsId("stageId")
    private Stage stage;
}