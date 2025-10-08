package com.darrendelimond.spring.core.demo.rest;


import com.darrendelimond.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    private Coach myCoach;

    private Coach anotherCoach;

    @Autowired
    public ApplicationController(
            @Qualifier("basketballCoach") Coach theCoach,
            @Qualifier("basketballCoach") Coach theAnotherCoach){
        System.out.println("Initializing: "+ this.getClass().getSimpleName());
        this.myCoach = theCoach;
        this.anotherCoach = theAnotherCoach;
    }


    @GetMapping("/")
    public String greeting(){
        return "Welcome to my site";
    }


    @GetMapping("/check")
    public String check(){
      return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return myCoach.getDailyWorkout();
    }




}
