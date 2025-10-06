package com.darrendelimond.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.sound.midi.Track;

@Component
@Lazy
public class TrackCoach implements Coach{

   public  TrackCoach(){
       System.out.println("Initializing: "+ this.getClass().getSimpleName());
    }

    public String getDailyWorkout(){
       return "Run a hard 5K";
    };
}
