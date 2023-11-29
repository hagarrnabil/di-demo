package com.example.didemo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import services.GreetingServiceImpl;

//example of bad dependency injection with abstract class
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
