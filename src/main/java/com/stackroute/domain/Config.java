package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = "com.stackroute")
public class Config {

    @Bean
    public Actor actor()
    {
        return new Actor("Messi","male",22);
    }

    @Bean
    public Actor actor1()
    {
        return new Actor("Ronaldo","male",22);
    }

    @Bean
    public Actor actor2() {
        return new Actor("Kaka", "male", 22);
    }

    /* @Bean({"movie1","movie2"})
     @Scope("prototype")
     public Movie makeMovieObject()
     {
         Movie movie =new Movie();
         return movie;
     }*/
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
    {
        BeanLifecycleDemoBean beanLifecycleDemoBean=new BeanLifecycleDemoBean();
        return beanLifecycleDemoBean;

    }

}