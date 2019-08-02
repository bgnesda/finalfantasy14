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
@Table(name = "CharacterCraftingJob")
public class CharacterCraftingJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "character_id", nullable = false)
    private Long character_id;

    @NotEmpty
    @Column(name = "alchemist", nullable = false)
    private Long alchemist;

    @NotEmpty
    @Column(name = "armorer", nullable = false)
    private Long armorer;

    @NotEmpty
    @Column(name = "blacksmith", nullable = false)
    private Long blacksmith;

    @NotEmpty
    @Column(name = "carpenter", nullable = false)
    private Long carpenter;

    @NotEmpty
    @Column(name = "culinarian", nullable = false)
    private Long culinarian;

    @NotEmpty
    @Column(name = "goldsmith", nullable = false)
    private Long goldsmith;

    @NotEmpty
    @Column(name = "leatherworker", nullable = false)
    private Long leatherworker;

    @NotEmpty
    @Column(name = "weaver", nullable = false)
    private Long weaver;
}
