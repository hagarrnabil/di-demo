package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;

//example of bad dependency injection with setters
public class SetterInjectedController {
    public GreetingService greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
