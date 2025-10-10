package com.darrendelimond.spring.core.demo.common;


public class SwimCoach implements Coach{

    public SwimCoach(){

        System.out.println("Initializing: "+ this.getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout(){
        return "Swim 1000 meters as a warm up";
    }
}
