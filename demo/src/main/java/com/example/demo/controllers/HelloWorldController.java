package com.example.demo.controllers;

import com.example.demo.model.Elev;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/salut")
    public String sayHello(){
        return "Salut !";
    }

    @GetMapping("/adaugaElev")
    public String adaugaElev(){
        Elev elev = new Elev(1L, "Ion", "Apetrei");
        return "s-a adaugat eleveul " + elev.toString();
    }
}
