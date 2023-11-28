package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//example of bad dependency injection with abstract class
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
