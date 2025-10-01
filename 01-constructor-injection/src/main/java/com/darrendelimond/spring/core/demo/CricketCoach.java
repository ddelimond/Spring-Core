package com.darrendelimond.spring.core.demo;


import org.springframework.stereotype.Component;

@Component
// ^^ Marks the class as a Spring Bean, which makes it available for dependency injection
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes";
    }
}
