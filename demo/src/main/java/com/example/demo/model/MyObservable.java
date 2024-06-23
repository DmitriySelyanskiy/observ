package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class MyObservable {


    private List<MyPattern> patterns = new ArrayList<>();

    public MyObservable() {
    }

    public void addObserver(MyPattern channel) {
        this.patterns.add(channel);
    }

    public void setNotification(String notification) {
        patterns.forEach(p -> p.update(notification));
    }
}
