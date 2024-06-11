package com.APRG.SpaceShooters;

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

    @GetMapping("/")
    public String landingPage(){
        return "landingPage";
    }


    @GetMapping("/game")
    public String gameLaunch(){
        return "game";
    }

    @GetMapping("/registerLogin")
    public String registerLogin(){
        return "registerLogin";
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

//    @PostMapping("/welcome")
//    public String postingOn(Model model, @RequestParam("uName") String uName){
//        model.addAttribute("username", uName);
//        return "welcome";
//    }
}
