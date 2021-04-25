package com.training.inqoo.springcorelab;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
public class Bean1Asc {
    List<Integer> listStore = new ArrayList<>();

    void add(int n){
        listStore.add(n);
    }

    public List<Integer> getListStore() {
        listStore.sort(Comparator.naturalOrder());
        return listStore;
    }
}
