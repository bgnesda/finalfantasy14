package com.example.ff14.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
@Table(name = "CharacterBattleJob")
public class CharacterBattleJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "character_id", nullable = false)
    private Long character_id;

    @NotNull
    @Column(name = "dark_knight", nullable = false)
    private Long dark_knight;

    @NotNull
    @Column(name = "gunbreaker", nullable = false)
    private Long gunbreaker;

    @NotNull
    @Column(name = "paladin", nullable = false)
    private Long paladin;

    @NotNull
    @Column(name = "warrior", nullable = false)
    private Long warrior;

    @NotNull
    @Column(name = "astrologian", nullable = false)
    private Long astrologian;

    @NotNull
    @Column(name = "scholar", nullable = false)
    private Long scholar;

    @NotNull
    @Column(name = "white_mage", nullable = false)
    private Long white_mage;

    @NotNull
    @Column(name = "bard", nullable = false)
    private Long bard;

    @NotNull
    @Column(name = "black_mage", nullable = false)
    private Long black_mage;

    @NotNull
    @Column(name = "dancer", nullable = false)
    private Long dancer;

    @NotNull
    @Column(name = "dragoon", nullable = false)
    private Long dragoon;

    @NotNull
    @Column(name = "machinist", nullable = false)
    private Long machinist;

    @NotNull
    @Column(name = "monk", nullable = false)
    private Long monk;

    @NotNull
    @Column(name = "ninja", nullable = false)
    private Long ninja;

    @NotNull
    @Column(name = "red_mage", nullable = false)
    private Long red_mage;

    @NotNull
    @Column(name = "samurai", nullable = false)
    private Long samurai;

    @NotNull
    @Column(name = "summoner", nullable = false)
    private Long summoner;

}
