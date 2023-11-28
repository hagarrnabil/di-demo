package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import com.example.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//best way of dependency injection using constructors
@Controller
public class ConstructorInjectedController {
    @Autowired
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
