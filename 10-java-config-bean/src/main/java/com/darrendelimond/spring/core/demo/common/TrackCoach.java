package com.darrendelimond.spring.core.demo.common;

import org.springframework.stereotype.Component;

@Component

public class TrackCoach implements Coach{

   public  TrackCoach(){
       System.out.println("Initializing: "+ this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
       return "Run a hard 5K";
    };
}
