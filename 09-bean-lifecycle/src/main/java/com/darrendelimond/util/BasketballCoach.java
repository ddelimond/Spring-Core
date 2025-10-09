package com.darrendelimond.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    public BasketballCoach (){

        System.out.println("Initializing: "+ this.getClass().getSimpleName());

    }

@PostConstruct
    public void createBean(){
        System.out.println("Creating Bean: "+ getClass().getSimpleName());
    }
@PreDestroy
    public void destroyBean(){
        System.out.println("Destroying Bean: "+ getClass().getSimpleName());
    }
    public String getDailyWorkout(){
        return "Give me 30 full court suicides";
    }
}
