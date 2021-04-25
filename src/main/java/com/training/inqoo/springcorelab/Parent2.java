package com.training.inqoo.springcorelab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parent2 {
    private Child child = new Child();

    @Autowired
    public void setChild(Child child){
        this.child = child;
        System.out.println("in parent 2");
    }
}
