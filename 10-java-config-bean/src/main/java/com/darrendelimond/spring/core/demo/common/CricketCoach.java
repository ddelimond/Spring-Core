package com.darrendelimond.spring.core.demo.common;


import org.springframework.stereotype.Component;

@Component
// ^^ Marks the class as a Spring Bean, which makes it available for dependency injection
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("Initializing: "+ this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes";
    }
}
