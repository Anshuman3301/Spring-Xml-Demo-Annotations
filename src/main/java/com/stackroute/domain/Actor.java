package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    

    //initailise one actor with its properties
    private String name;
    private String gender;
    private int age;

    public Actor() {

    }

    //create an actor object
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //set his name.
    public void setName(String name) {
        this.name = name;
    }
    

    //set his gender.
    public void setGender(String gender) {
        this.gender = gender;
    }

    //set his age.
    public void setAge(int age) {
        this.age = age;
    }

    //print the properties of the actor.
    public void printActor()
    {
        System.out.println("Actor's Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age);
    }

}
