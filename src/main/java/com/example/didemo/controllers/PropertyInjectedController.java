package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;

//example of bad dependency injection with abstract class
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
