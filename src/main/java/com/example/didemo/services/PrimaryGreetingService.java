package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi, injected by the Primary";
    }
}