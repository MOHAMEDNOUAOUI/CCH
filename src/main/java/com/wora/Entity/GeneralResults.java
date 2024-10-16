package com.wora.Entity;

import com.wora.Entity.Embeded.GeneralResultsEmbd;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Duration;


@Getter
@Setter
@Entity
@Table(name = "general_results")
public class GeneralResults{
    @EmbeddedId
    private GeneralResultsEmbd generalResults;

    @Column(name = "generalrank")
    private Integer generalrank;

    @Column(name = "generalduration")
    private Duration generalduration;

    @MapsId("CompetitionId")
    @ManyToOne
    private Competition competition;

    @MapsId("CyclistId")
    @ManyToOne
    private Cyclist cyclist;
}