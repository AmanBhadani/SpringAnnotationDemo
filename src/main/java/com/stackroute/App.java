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
        Movie moviey = context.getBean("moviey",Movie.class);
        System.out.println(moviey);
        System.out.println("For default : "+(moviex==moviex));
        Movie moviez = context.getBean("moviez",Movie.class);
        System.out.println("For output : "+(moviey==moviez));
        System.out.println(moviez);

    }
}
