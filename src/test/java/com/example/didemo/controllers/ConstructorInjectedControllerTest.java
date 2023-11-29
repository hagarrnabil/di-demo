package com.example.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.Hello_World, constructorInjectedController.sayHello());
    }
}
