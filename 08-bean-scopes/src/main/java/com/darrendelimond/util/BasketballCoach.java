package com.darrendelimond.util;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketballCoach implements Coach{

    public BasketballCoach (){

        System.out.println("Initializing: "+ this.getClass().getSimpleName());

    }
    public String getDailyWorkout(){
        return "Give me 30 full court suicides";
    }
}
