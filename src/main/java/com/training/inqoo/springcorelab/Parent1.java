package com.training.inqoo.springcorelab;

import org.springframework.stereotype.Component;

@Component
public class Parent1 {
    private final Child child;

    public Parent1(Child child) {
        this.child = child;
        System.out.println("in parent 1 ");
    }
}
