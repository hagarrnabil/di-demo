package com.example.didemo.controllers;


import org.springframework.stereotype.Controller;
import com.example.didemo.services.GreetingService;

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
