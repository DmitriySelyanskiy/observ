package com.example.demo.model;

public class Normal implements MyPattern{

    private String notification;

    public Normal() {
        System.out.println("I'm Normal");
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
