package com.APRG.SpaceShooters;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("HIGHSCORES")
public class HighscoreEnt {

    @Id
    private long id;

    @Column
    private final String name;

    @Column
    private final int highscore;

    HighscoreEnt(String name, int highscore) {
        this.name = name;
        this.highscore = highscore;
    }
}
