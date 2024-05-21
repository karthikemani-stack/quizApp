package com.telusko.quizapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class MyConfiguration {
    @Autowired
    private Environment environment;
public  String doSomething(){
    String myPropertyValue = environment.getProperty("my.property.key");
    System.out.println("my.property.key value is : "+myPropertyValue);
    return myPropertyValue;
}
}
