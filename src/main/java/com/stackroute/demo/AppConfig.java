package com.stackroute.demo;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Actor getactor(){
        Actor actor = new Actor();
        actor.setAge(24);
        actor.setGender("Male");
        actor.setName("Aman");
        return actor;
    }

    @Bean
    public Movie movie(){

        return new Movie(getactor());
    }
}
