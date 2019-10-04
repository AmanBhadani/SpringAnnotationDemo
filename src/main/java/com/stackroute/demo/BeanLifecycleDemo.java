package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemo implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("After Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Under properties Set");
    }
    public void customInit(){
        System.out.println("Init");
    }
    public void customDestroy(){
        System.out.println("Destroy");
    }
}
