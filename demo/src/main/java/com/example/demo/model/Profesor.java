package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profesor extends Persoana{
    private Long id;
    public Profesor(Long id, String nume, String prenume){
        super(nume, prenume);
        this.id = id;
    }
}
