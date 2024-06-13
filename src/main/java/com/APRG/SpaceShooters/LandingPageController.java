package com.APRG.SpaceShooters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LandingPageController {
//    @GetMapping("/start")
//    public String landingPage(){
//        return "start";
//    }

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

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

    @GetMapping("/gameOver")
    public String gameOver(){
        return "gameOver";
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

//    @PostMapping("/gameOver")
//    public String gameOver(Model model, @RequestParam("score") int score){
//        model.addAttribute("highscore", score);
//        return "gameOver";
//    }

//    @PostMapping("/welcome")
//    public String postingOn(Model model, @RequestParam("uName") String uName){
//        model.addAttribute("username", uName);
//        return "welcome";
//    }



}
