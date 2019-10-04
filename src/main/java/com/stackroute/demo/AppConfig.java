package com.stackroute.demo;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Actor actor(){

        return new Actor("Aman","male",22);
    }


    @Bean
    public Movie movie(){
        return new Movie(actor());
    }

    @Bean(initMethod ="customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemo demo(){
        return new BeanLifecycleDemo();
    }




}
