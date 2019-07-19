package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    
    //initialise an actor object.
    private Actor actor;

    //initialise the actor object inside movie class
    public Movie(Actor actor) {
        this.actor = actor;
    }

    //set the actor
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //print the actor
    public void printAboutMovieActor()
    {
        actor.printActor();
    }
}
