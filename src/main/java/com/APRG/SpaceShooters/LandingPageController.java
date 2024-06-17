package com.APRG.SpaceShooters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@Controller
public class LandingPageController {
//    @GetMapping("/start")
//    public String landingPage(){
//        return "start";
//    }

    @Autowired
    private HighscoreRepository highscoreRepo;

//    LandingPageController(HighscoreRepository highscoreRepo) {this.highscoreRepo = highscoreRepo;}

    @GetMapping("/")
    public String landingPage(){
        return "landingPage";
    }

    @GetMapping("/game")
    public String gameLaunch(){
        return "game";
    }

    @GetMapping("/settings")
    public String settings(){
        return "settings";
    }

    @GetMapping("/gameOverOrEnded")
    public String gameOver(){
        return "gameOverOrEnded";
    }

    @GetMapping("/mainMenu")
    public String mainMenu(){
        return "mainMenu";
    }
//    @GetMapping("/leaderboard")
//    public String leaderboard(){
//        return "leaderboard";
//    }
    @GetMapping("/help")
    public String help(){
        return "help";
    }
    @GetMapping("/contributorsAndSources")
    public String contributorsAndSources(){
        return "contributorsAndSources";
    }

    @PostMapping("/retry")
    public String retry(Model model, @RequestParam String username, @RequestParam Integer highscore){
        var newScore = new HighscoreEnt(username, highscore);
        highscoreRepo.save(newScore);

        model.addAttribute("username", username);
        model.addAttribute("highscore", highscore);
        return "retry";
    }

    @GetMapping("/leaderboard")
    public String leaderboard(Model model){
        List<String> names = highscoreRepo.findNames();
        List<Integer> highscores = highscoreRepo.findScores();
        for(int i = 1;i < 6; i++ ){
            model.addAttribute("username"+i, names.get(i-1));
            model.addAttribute("highscore"+i, highscores.get(i-1));
        }

        return "leaderboard";
    }


//    @PostMapping("/mainMenu")
//    public String mainMenu(Model model, @RequestParam("username") String uName){
//        model.addAttribute("username", uName);
//        return "mainMenu";
//    }

//    @PostMapping("/gameOverOrEnded")
//    public String gameOverOrEnded(Model model, @RequestParam("score") int score){
//        model.addAttribute("highscore", score);
//        return "gameOverOrEnded";
//    }

}
