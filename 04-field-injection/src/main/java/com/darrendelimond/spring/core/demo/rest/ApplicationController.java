package com.darrendelimond.spring.core.demo.rest;


import com.darrendelimond.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {


    @Autowired
    private Coach myCoach;


    @GetMapping("/")
    public String greeting(){
        return "Welcome to my site";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return myCoach.getDailyWorkout();
    }

}
