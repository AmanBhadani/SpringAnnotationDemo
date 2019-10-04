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

    @Bean
    public Movie moviex(){
        return new Movie(actor());
    }
    @Bean
    public Movie moviey(){
        return new Movie(actor());
    }
    @Bean
    @Scope("prototype")
    public Movie moviez(){
        return new Movie(actor());
    }
}
