package com.darrendelimond.util;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    public BasketballCoach (){

    }
    public String getDailyWorkout(){
        return "Give me 30 full court suicides";
    }
}
