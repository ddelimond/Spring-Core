package com.darrendelimond.spring.core.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    public BasketballCoach (){

        System.out.println("Initializing: "+ this.getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout(){
        return "Give me 30 full court suicides";
    }
}
