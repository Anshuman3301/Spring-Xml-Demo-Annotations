package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.stackroute")
public class Config {
    

    //creating an actor bean
    @Bean
    public Actor actor()
    {
        Actor actor =new Actor();
        actor.setAge(22);
        actor.setGender("male");
        actor.setName("Agha");
        return actor;
    }
    
    //creating a movie bean
    @Bean("movie1")
    public Movie makeMovieObject()
    {
        Movie movie =new Movie(actor());
        return movie;
    }



}
