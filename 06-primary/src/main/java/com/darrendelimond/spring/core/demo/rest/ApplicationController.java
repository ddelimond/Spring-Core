package com.darrendelimond.spring.core.demo.rest;


import com.darrendelimond.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    private Coach myCoach;

    @Autowired
    public ApplicationController(Coach theCoach){
        this.myCoach = theCoach;
    }


    @GetMapping("/")
    public String greeting(){
        return "Welcome to my site";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return myCoach.getDailyWorkout();
    }

}
