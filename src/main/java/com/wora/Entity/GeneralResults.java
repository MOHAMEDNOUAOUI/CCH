package com.wora.Entity;

import com.wora.Entity.Embeded.GeneralResultsEmbd;
import jakarta.persistence.*;

@Entity
@Table(name = "general_results")
public class GeneralResults {
    @EmbeddedId
    private GeneralResultsEmbd generalResults;

    @Column(name = "generalrank")
    private Integer generalrank;

    @MapsId("CompetitionId")
    @ManyToOne
    private Competition competition;

    @MapsId("CyclistId")
    @ManyToOne
    private Cyclist cyclist;
}