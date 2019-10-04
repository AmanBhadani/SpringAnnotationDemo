package com.stackroute;

import com.stackroute.demo.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie moviex1 = context.getBean("moviex",Movie.class);
        Movie moviex2 = context.getBean("moviex",Movie.class);
        Movie moviey1 = context.getBean("moviez",Movie.class);
        Movie moviey2 = context.getBean("moviez",Movie.class);
        System.out.println(moviex1);
        System.out.println(moviex2);
        System.out.println("For default "+(moviex1==moviex2));
        System.out.println(moviey1);
        System.out.println(moviey2);
        System.out.println("For Prototype "+(moviey1==moviey2));

    }
}