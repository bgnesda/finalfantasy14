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
@Table(name = "FFCharacter")
public class Character {
    @Id
    @Column(name = "ID")
    private Long id;

    @NotEmpty
    @Column(name = "Avatar", nullable = false)
    private String avatar;

    @NotEmpty
    @Column(name = "Name", nullable = false)
    private String name;

}
