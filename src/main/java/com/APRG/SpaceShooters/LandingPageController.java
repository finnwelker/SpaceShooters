package com.APRG.SpaceShooters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LandingPageController {

    @Autowired
    private HighscoreRepository highscoreRepo;

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

    @GetMapping("/leaderboard")
    public String leaderboard(){
        return "leaderboard";
    }

    @GetMapping("/gameOverOrEnded")
    public String gameEnded(){
        return "gameOverOrEnded";
    }

    @GetMapping("/retry")
    public String retry(){
        return "retry";
    }

    @GetMapping("/help")
    public String help(){
        return "help";
    }

    @GetMapping("/contributorsAndSources")
    public String contributorsSources(){
        return "contributorsAndSources";
    }

//    @GetMapping("/mainMenu")
//    public String mainMenu(){
//        return "mainMenu";
//    }

    @PostMapping("/mainMenu")
    public String mainMenu(Model model, @RequestParam("username") String uName){
        model.addAttribute("username", uName);
        return "mainMenu";
    }

//    @PostMapping("/gameOverOrEnded")
//    public String gameOverOrEnded(Model model, @RequestParam("score") int score){
//        model.addAttribute("highscore", score);
//        return "gameOverOrEnded";
//    }

}
