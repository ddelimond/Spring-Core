package com.darrendelimond.util;

import org.springframework.stereotype.Component;

import javax.sound.midi.Track;

@Component
public class TrackCoach implements Coach{

   public  TrackCoach(){

    }

    public String getDailyWorkout(){
       return "Run a hard 5K";
    };
}
