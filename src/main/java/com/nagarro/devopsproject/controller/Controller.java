package com.nagarro.devopsproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api")
    public String message(){
        return "Myself Ashish patwa";
    }
}
