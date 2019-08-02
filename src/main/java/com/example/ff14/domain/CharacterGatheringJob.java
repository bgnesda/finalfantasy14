package com.example.ff14.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Getter
@Setter
@Table(name = "CharacterGatheringJob")
public class CharacterGatheringJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "character_id", nullable = false)
    private Long character_id;

    @NotEmpty
    @Column(name = "botanist", nullable = false)
    private Long botanist;

    @NotEmpty
    @Column(name = "fisher", nullable = false)
    private Long fisher;

    @NotEmpty
    @Column(name = "miner", nullable = false)
    private Long miner;
}
