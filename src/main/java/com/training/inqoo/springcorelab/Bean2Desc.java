package com.training.inqoo.springcorelab;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Bean2Desc {
    List<Integer> listStore = new ArrayList<>();

    public List<Integer> getListStore() {
        return listStore;
    }

    void add(int n){
        listStore.add(n);
    }
}
