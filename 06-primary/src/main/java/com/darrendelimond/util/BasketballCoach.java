package com.darrendelimond.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketballCoach implements Coach{

    public BasketballCoach (){

    }
    public String getDailyWorkout(){
        return "Give me 30 full court suicides";
    }
}
