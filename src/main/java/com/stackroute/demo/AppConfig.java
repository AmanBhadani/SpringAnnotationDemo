package com.stackroute.demo;

import com.stackroute.domain.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.domain")
public class AppConfig {
    @Bean
    public Actor actor(){
        return new Actor("Aman","male",22);
    }


    @Bean
    public Actor setactor(){
        Actor actor = new Actor("Aman Bhadani","Male",22);
        return actor;
    }

}
