package com.stackroute.demo;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Actor actor(){

        return new Actor("Aman","male",22);
    }


    @Bean("moviex")
    public Movie moviex(){
        return new Movie(actor());
    }


    @Bean("moviez")
    @Scope("prototype")
    public Movie moviez(){
        return new Movie(actor());
    }



}
