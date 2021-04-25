package com.training.inqoo.springcorelab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parent3 {

    @Autowired
    private Child child;

    @PostConstruct
    void postconstruct(){
        System.out.println("been has been created " + child);
    }
}
