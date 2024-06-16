package com.APRG.SpaceShooters;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HighscoreRepository extends ListCrudRepository<HighscoreEnt, Long> {
//    @Query("SELECT * FROM HIGHSCORES where LOWER(name) = LOWER(:name)")
//            List<HighscoreEnt> findByName(String name);

    @Query("SELECT HIGHSCORE FROM HIGHSCORES ORDER BY HIGHSCORE")                                                       // Returns all highscores sorted highest to lowest
            List<Integer> findScores();

    @Query("SELECT NAME FROM HIGHSCORES ORDER BY HIGHSCORE")                                                            // Returns all mames sorted by highest Score to lowest (Corresponding to above list)
            List<String> findNames();
}
