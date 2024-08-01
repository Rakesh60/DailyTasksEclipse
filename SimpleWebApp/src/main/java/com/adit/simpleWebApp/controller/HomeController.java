package com.adit.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("I am here");
        return "Welcome To Spring Boot";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome to about page";
    }

}
