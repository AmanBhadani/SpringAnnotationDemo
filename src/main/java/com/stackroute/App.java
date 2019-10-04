package com.stackroute;

import com.stackroute.demo.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie moviex = context.getBean("moviex",Movie.class);
        System.out.println(moviex);

    }
}