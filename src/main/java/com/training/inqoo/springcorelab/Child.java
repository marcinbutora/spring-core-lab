package com.training.inqoo.springcorelab;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Child {

    @PostConstruct
    void postconstruct(){
        System.out.println("been has been created " + this);
    }

    @PreDestroy
    void predestroy(){
        System.out.println("been has been destroyed");
    }
}
