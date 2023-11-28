package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//example of bad dependency injection with setters
@Controller
public class SetterInjectedController {
    public GreetingService greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
