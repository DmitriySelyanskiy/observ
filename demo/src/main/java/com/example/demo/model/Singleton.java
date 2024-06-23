package com.example.demo.model;

import java.util.Observable;

public class Singleton extends Observable implements MyPattern {

    private String notification;

    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    @Override
    public String print() {
       return this.notification;
    }

    @Override
    public void update(String notification) {
        this.notification = notification;
    }
}
