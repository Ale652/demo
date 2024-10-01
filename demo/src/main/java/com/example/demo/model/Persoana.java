package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persoana {
    String nume;
    String prenume;

    public Persoana(String nume, String prenume){
        this.prenume = prenume;
        this.nume = nume;
    }
}
