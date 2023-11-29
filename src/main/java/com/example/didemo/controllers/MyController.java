package com.example.didemo.controllers;


import org.springframework.stereotype.Controller;
import services.GreetingService;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){

        System.out.println("hello");

        return greetingService.sayGreeting();
    }
}
