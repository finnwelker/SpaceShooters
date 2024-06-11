package com.APRG.SpaceShooters;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("HIGHSCORE")
public class HighscoreEnt {

    @Id
    private long id;

    @Column
    private final String name;

    @Column
    private final int score;

    HighscoreEnt(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
