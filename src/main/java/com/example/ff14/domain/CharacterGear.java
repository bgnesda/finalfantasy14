package com.example.ff14.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
@Table(name = "CharacterGear")
public class CharacterGear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "character_id")
    private Long character_id;

    @NotEmpty
    @Column(name = "earrings", nullable = false)
    private String earrings;

    @NotNull
    @Column(name = "earringsILVL")
    private Long earringsILVL;

    @NotEmpty
    @Column(name = "hands", nullable = false)
    private String hands;

    @NotNull
    @Column(name = "handsILVL")
    private Long handsILVL;

    @NotEmpty
    @Column(name = "legs", nullable = false)
    private String legs;

    @NotNull
    @Column(name = "legsILVL")
    private Long legsILVL;

    @NotEmpty
    @Column(name = "necklace", nullable = false)
    private String necklace;

    @NotNull
    @Column(name = "necklaceILVL")
    private Long necklaceILVL;

    @NotEmpty
    @Column(name = "head", nullable = false)
    private String head;

    @NotNull
    @Column(name = "headILVL")
    private Long headILVL;

    @NotEmpty
    @Column(name = "feet", nullable = false)
    private String feet;

    @NotNull
    @Column(name = "feetILVL")
    private Long feetILVL;

    @NotEmpty
    @Column(name = "bracelets", nullable = false)
    private String bracelets;

    @NotNull
    @Column(name = "braceletsILVL")
    private Long braceletsILVL;

    @NotEmpty
    @Column(name = "ring1", nullable = false)
    private String ring1;

    @NotNull
    @Column(name = "ring1ILVL")
    private Long ring1ILVL;

    @NotEmpty
    @Column(name = "ring2", nullable = false)
    private String ring2;

    @NotNull
    @Column(name = "ring2ILVL")
    private Long ring2ILVL;

    @NotEmpty
    @Column(name = "waist", nullable = false)
    private String waist;

    @NotNull
    @Column(name = "waistILVL")
    private Long waistILVL;

    @NotEmpty
    @Column(name = "mainhand", nullable = false)
    private String mainhand;

    @NotNull
    @Column(name = "mainhandILVL")
    private Long mainhandILVL;

    @NotEmpty
    @Column(name = "body", nullable = false)
    private String body;

    @NotNull
    @Column(name = "bodyILVL")
    private Long bodyILVL;

}
