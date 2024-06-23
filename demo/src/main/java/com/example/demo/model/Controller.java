package com.example.demo.model;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/test/{patternName}/{notification}")
    public String getPattern(@PathVariable String patternName, @PathVariable String notification) {

        return switch (patternName) {
            case "singelton" -> createObservable(Singleton.getInstance(), notification);
            case "normal" ->  createObservable(new Normal(), notification);
            default -> throw new IllegalStateException("Unexpected value: " + patternName);
        };
    }

    private String createObservable(MyPattern myPattern, String notification) {
        MyObservable observable = new MyObservable();
        observable.addObserver(myPattern);
        observable.setNotification(notification);
        return myPattern.print();
    }

}
