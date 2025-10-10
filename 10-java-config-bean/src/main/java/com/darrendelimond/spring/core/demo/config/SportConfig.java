package com.darrendelimond.spring.core.demo.config;


import com.darrendelimond.spring.core.demo.common.Coach;
import com.darrendelimond.spring.core.demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
