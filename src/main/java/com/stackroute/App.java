package com.stackroute;

import com.stackroute.demo.AppConfig;
import com.stackroute.demo.BeanLifecycleDemo;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanLifecycleDemo demo = context.getBean(BeanLifecycleDemo.class);
        BeanPostProcessorDemoBean postdemo = context.getBean(BeanPostProcessorDemoBean.class);
        Movie movie = context.getBean(Movie.class);
        System.out.println(movie);
        context.close();


    }
}