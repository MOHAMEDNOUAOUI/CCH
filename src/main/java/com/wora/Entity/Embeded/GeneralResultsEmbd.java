package com.wora.Entity.Embeded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Setter;

@Setter
@Embeddable
public class GeneralResultsEmbd {
    @Column(name = "cyclist_id")
    private Long CyclistId;
    @Column(name = "competition_id")
    private Long CompetitionId;
}
