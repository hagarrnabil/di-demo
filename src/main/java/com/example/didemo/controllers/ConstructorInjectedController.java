package com.example.didemo.controllers;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.example.didemo.services.GreetingService;

//best way of dependency injection using constructors
@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
